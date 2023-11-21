package com.example.firebasetest.lsy.imageShareApp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firebasetest.lsy.MyApplication
import com.example.firebasetest.lsy.Utils.MyUtil
import com.example.firebasetest.lsy.databinding.ActivityMainImageShareAppBinding

// 스토어, 스토리지에서  데이터를 받아서, 리사이클러뷰 로 출력할 예정.
// 인증, 구글인증, 이메일 , 패스워드 인증 재사용.
// 인증이 되어야 글쓰기 가능하게 하고,
// 일단, 삭제한번 도전해보고,
// 수정 도전해보기.
class MainImageShareAppActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainImageShareAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainImageShareAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 해당 메인 앱이 실행이 되면, 먼저, 현재 앱의 외부 스토리지에 접근 권한 체크를 하기.
        MyUtil.checkPermission(this)

        // 플로팅 액션 번튼 클릭시, 글쓰기 뷰로 이동하기 작업.
        binding.addFabtn.setOnClickListener {
            // 글쓰기 전에, 인증 여부 확인 하기.
            if(MyApplication.checkAuth()) {
                // 글쓰기 페이지 이동 -> AddImageShareApp
                //이름 수정 : AddImageShareAppActivity
            } else {
                Toast.makeText(this,"인증 후 글쓰기 해주세요",Toast.LENGTH_SHORT).show()
            }
        }


    }// onCreate


}