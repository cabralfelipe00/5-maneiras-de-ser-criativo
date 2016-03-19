package com.example.android.trabalho;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //telas de 1 a 6
    int tela = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void email() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "cabralfelipe00@gmail.com");
    intent.putExtra(Intent.EXTRA_SUBJECT, "5 maneiras de ser mais produtivo!");
        intent.putExtra(Intent.EXTRA_TEXT, "Agora fale o que você achou do aplicativo!");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }



    public void voltarCuriosidades(View v) {
        if (tela == 2) {
            tela--;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.foto1);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto);
        } else if (tela == 3) {
            tela--;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.foto2jpg);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema2);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto2);

        } else if (tela == 4) {
            tela--;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.foto3);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema3);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto3);

        } else if (tela == 5) {
            tela--;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.foto4);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema4);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto4);
            ;
        } else if (tela == 6) {
            tela--;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.foto5);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema5);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto5);

        }

        else if (tela == 1) {
            Toast toast = Toast.makeText(this, "Não há outra página", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void proximaCuriosidade(View v) {

        if (tela == 1) {
            tela++;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.foto2jpg);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema2);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto2);

        } else if (tela == 2) {
            tela++;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.foto3);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema3);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto3);

        } else if (tela == 3) {
            tela++;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.foto4);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema4);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto4);
        } else if (tela == 4) {
            tela++;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.criatividade9);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema5);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto5);
        } else if (tela == 5) {
            tela++;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.foto5);
            TextView tema = (TextView) findViewById(R.id.tema);
            tema.setText(R.string.tema6);
            TextView texto = (TextView) findViewById(R.id.texto_principal);
            texto.setText(R.string.texto6);
        } else if (tela == 6) {
            email();

        }

    }
}


























