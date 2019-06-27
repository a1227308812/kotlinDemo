package com.zwp.mykotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //常亮申明val
    val name: String = "名字"
    //变量申明var
    var sex = "男"
    var age = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_main.setOnClickListener {
            tv_main.setText("name = $name/n sex = $sex/n age= $age")
        }
    }
}
