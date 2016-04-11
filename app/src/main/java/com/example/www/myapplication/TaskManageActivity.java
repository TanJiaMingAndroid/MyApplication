package com.example.www.myapplication;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.text.InputType;
        import android.view.Gravity;
        import android.widget.EditText;

public class TaskManageActivity extends AppCompatActivity {
    private EditText _et_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_manage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        _et_content = (EditText) findViewById(R.id.et_content);
        initEditext();


    }

    //设置Editext开头填写以及自动换行
    private void initEditext() {
        //设置EditText的显示方式为多行文本输入
        _et_content.setInputType(InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        //文本显示的位置在EditText的最上方
        _et_content.setGravity(Gravity.TOP);
        _et_content.setText("数据测试数据测试数据测试数据测试数据测试数据测试");
        _et_content.setSingleLine(false);
        //水平滚动设置为False
        _et_content.setHorizontallyScrolling(false);
    }

}