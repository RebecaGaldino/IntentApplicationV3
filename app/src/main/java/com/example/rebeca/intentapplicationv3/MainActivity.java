package com.example.rebeca.intentapplicationv3;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText field;
    EditText horaEditText;
    EditText minutoEditText;;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        field = (EditText) findViewById(R.id.field);
        horaEditText = (EditText) findViewById(R.id.horaEditText);
        minutoEditText = (EditText) findViewById(R.id.minutoEditText);
    }

    /** Abre um mapa no google maps
     *
     * @param view
     */
    public void googleMaps(View view) {
        Uri uri = Uri.parse("https://goo.gl/maps/9M6dSokYFGk");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    /**PCaptura um número de telefone digitado pelo usuário e manda uma mensagem
     *
     * @param view
     */
    public void enviarSms(View view) {

        String number = field.getText().toString();

        Uri sms_uri = Uri.parse("smsto:"+number);
        Intent sms_intent = new Intent(Intent.ACTION_SENDTO, sms_uri);
        sms_intent.putExtra("sms_subject", "");//Solicitacao da mensagem
        startActivity(sms_intent);


    }

    /** Abre o menu de configurações do dispositivo
     *
     * @param view
     */
    public void configuracoes (View view){
        Intent viewIntent = new Intent(Settings.ACTION_SETTINGS);
        startActivity(viewIntent);
    }


    /** Executa pesquisa no google
     *
     * @param view
     */
    public void buscaDireta(View view){

        String term = field.getText().toString();

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, term);
        startActivity(intent);
    }


    /** Toca uma música pesquisada do dispositivo
     *
     * @param view
     */
    public void buscaMusica(View view) {

        String artist = field.getText().toString();

        Intent intent = new Intent(MediaStore.INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH);
        intent.putExtra(MediaStore.EXTRA_MEDIA_FOCUS,
                MediaStore.Audio.Artists.ENTRY_CONTENT_TYPE);
        intent.putExtra(MediaStore.EXTRA_MEDIA_ARTIST, artist);
        intent.putExtra(SearchManager.QUERY, artist);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    /** Criacao de um novo alarme
     *
     * @param view
     */
    public void chamarAlarme(View view){

        Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
        i.putExtra(AlarmClock.EXTRA_MESSAGE,"New Alarm");
        i.putExtra(AlarmClock.EXTRA_HOUR, Integer.parseInt(horaEditText.getText().toString()));
        i.putExtra(AlarmClock.EXTRA_MINUTES, Integer.parseInt(minutoEditText.getText().toString()));
        startActivity(i);

    }

    /**
     * Calculadora apresentada em gridview
     * @param view
     */
    public void calculadora(View view){
        Intent intent = new Intent(this, CalculadoraActivity.class);
        startActivity(intent);
    }
}

