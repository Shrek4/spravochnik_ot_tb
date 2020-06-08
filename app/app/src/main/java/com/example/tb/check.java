package com.example.tb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class check extends AppCompatActivity {
    private int id;

    private String pageTitle;
    private String pageName;

    private TextView tv_pageTitle;
    private TextView tv_pageName;

    private LinearLayout layout;

    private ImageView btnBack;

    ArrayList<CheckBox> befor_cb = new ArrayList<>();
    ArrayList<CheckBox> after_cb = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        // Получаем ид
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.id = extras.getInt("id");

        tv_pageTitle = findViewById(R.id.page_title);
        tv_pageName = findViewById(R.id.page_name);
        layout = findViewById(R.id.linerForText);
        btnBack = findViewById(R.id.back_button);

        // Получаем текст
        if(id == 0){
            pageName = "Персональный компьютер";
        }
        else if(id==1){
            pageName = "Токарный станок";
        }
        else if(id==2){
            pageName = "Хим. оборудование";
        }
        pageTitle = "Чек-лист";

        tv_pageTitle.setText(pageTitle);
        tv_pageName.setText(pageName);

        ArrayList<String> before_work = new ArrayList<>();
        ArrayList<String> after_work = new ArrayList<>();

        //region Тексты чек-листов
        if(id==0) {
            before_work.add("1. Отрегулировать освещение на рабочем месте(блики на экране отсутствуют).");
            before_work.add("2. Проверить правильность подключения оборудования к электросети.");
            before_work.add("3. Проверить исправность проводов питания.");
            before_work.add("4. Проверить провода на отсутствие оголенных участков.");
            before_work.add("5. Убедиться в наличии заземления\n" +
                    "•системного блока;\n" +
                    "•монитора;\n" +
                    "•защитного экрана.");
            before_work.add("6. Протереть антистатической салфеткой поверхность экрана монитора и защитного экрана.");
            before_work.add("7. Проверить правильность установки\n" +
                    "•стола;\n" +
                    "•стула;\n" +
                    "•подставки для ног.");
            before_work.add("8. Отрегулировать\n" +
                    "•угла наклона экрана;\n" +
                    "•положение клавиатуры;\n" +
                    "•положение «мыши» на специальном коврике.");

            after_work.add("1. Отключить питание компьютера.");
            after_work.add("2. Привести в порядок рабочее место.");
            after_work.add("3. Выполнить упражнения для глаз и пальцев рук на расслабление.");
        }
        else if(id==1)
        {
            before_work.add("1. Надеть и тщательно застегнуть специальную одежду и технологическую обувь в соответствии с характером предстоящей работы.");
            before_work.add("2. Проверить внешним осмотром исправность станка\n" +
                    "•на станках кожухи предохранительные в наличии;\n" +
                    "•защитные устройства исправны;\n" +
                    "•заземление не нарушено.");
            before_work.add("3. Приготовить крючок для удаления стружки, ключи и другой инструмент.");
            before_work.add("4. Проверить исправность всех инструментов и приспособлений.");
            before_work.add("5. Проверить на холостом ходу станка:\n" +
                    "•исправность органов управления (механизмов главного движения подачи, пуска, остановку движения и др.);\n" +
                    "•исправность системы смазки и охлаждения;\n" +
                    "•исправность фиксации рычагов включения и выключения (убедиться в том, что возможность самопроизвольного переключения с холостого хода на рабочий исключена).");
            before_work.add("6. Проверить наличие и качество исходных материалов необходимых для выполнения производственного задания.");

            after_work.add("1. Выключить станок, дождаться его полной остановки.");
            after_work.add("2. Привести станок в исходное состояние.");
            after_work.add("3. Инструмент и приспособления очистить с соблюдением мер предосторожности.");
            after_work.add("4. Острые кромки инструмента обметать щеткой");
            after_work.add("5. Сложить инструменты и приспособления на место хранения");
            after_work.add("6. Убрать отходы в предназначенную для этого тару.");
            after_work.add("7. Снять спецодежду, осмотреть, вычистить и убрать в специально отведённое место.");
            after_work.add("8. Необходимо тщательно вымыть лицо и руки тёплой водой с мылом.");
        }
        else if(id==2)
        {
            before_work.add("1. Надеть спецодежду, спецобувь и другие необходимые для работы средства индивидуальной защиты.");
            before_work.add("2. Убедиться, что прибор правильно заземлен и включен в сеть переменного тока.");
            before_work.add("3. Проверить на исправность:\n" +
                    "•розетку;\n" +
                    "•вилку;\n" +
                    "•соединительный шнур.");

            after_work.add("1. Произвести чистку игл забора 70% этиловым спиртом;");
            after_work.add("2. Произвести очистку фильтров и блока поплавкового переключателя и промывку баков (воды, кислот, щелочи и слива) с помощью дистиллированной воды;");
            after_work.add("3. Произвести очистку фильтров и блока поплавкового переключателя и промывку баков 70% этиловым спиртом;");
            after_work.add("4. Произвести повторную очистку фильтров и блока поплавкового переключателя и промывку баков дистиллированной водой;");
            after_work.add("5. Промыть бак слива водопроводной водой;");
            after_work.add("6. Залить в баки соответствующий раствор, согласно инструкции производителя.");
        }
        //endregion

        TextView tv_before = new TextView(new ContextThemeWrapper(check.this, R.style.tb_name));
        tv_before.setText("Перед началом работы:");
        ((LinearLayout) layout).addView(tv_before);
        //Выводим на экран
        for (int i = 0; i < before_work.size(); i++){
            CheckBox cb_before = new CheckBox(new ContextThemeWrapper(check.this, R.style.checkbox));
            cb_before.setText(before_work.get(i));
            cb_before.setButtonDrawable(R.drawable.check_box_selector);
            cb_before.setId(8000+i);
            ((LinearLayout) layout).addView(cb_before);
            befor_cb.add(cb_before);
        }

        TextView tv_after = new TextView(new ContextThemeWrapper(check.this, R.style.tb_name));
        tv_after.setText("По окончании работы:");
        ((LinearLayout) layout).addView(tv_after);
        //Выводим на экран
        for (int i = 0; i < after_work.size(); i++){
            CheckBox cb_after = new CheckBox(new ContextThemeWrapper(check.this, R.style.checkbox));
            cb_after.setText(after_work.get(i));
            cb_after.setButtonDrawable(R.drawable.check_box_selector);
            cb_after.setId(9000+i);
            ((LinearLayout) layout).addView(cb_after);
            after_cb.add(cb_after);
        }

        btnBack.setOnClickListener(backClick);
    }

    //Закрываем по клику
    View.OnClickListener backClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
