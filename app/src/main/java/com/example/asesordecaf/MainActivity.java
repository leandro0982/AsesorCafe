package com.example.asesordecaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Spinner lista;
    Button btn_caracteristica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (Spinner) findViewById(R.id.lt_desplegable);
        btn_caracteristica = (Button) findViewById(R.id.bt_caracteristica);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tipos_cafe,
                R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        lista.setAdapter(adapter);


    }

    @Override
    public void onItemClick(final AdapterView<?> parent, View view, final int i, long l) {
        btn_caracteristica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String text = lista.getSelectedItem().toString();

                if (parent.getItemAtPosition(i).equals("")){
                    Intent intent = new Intent(MainActivity.this, Expertocafetalero.class);
                    startActivity(intent);
                }
                else {
                    String cafe = parent.getItemAtPosition(i).toString();
                    Toast.makeText(parent.getContext(), "Selecionar: ", Toast.LENGTH_LONG).show();

                    btn_caracteristica.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (parent.getItemAtPosition(i).equals("Arábica (Coffe Arábica)")){
                                String text = "La variedad de café Arábica es originaria de Etiopía, " +
                                        "se caracteriza desde un punto de vista aromático por un sabor dulce y afrutado, " +
                                        "en gran parte porque su grano tiene un bajo contenido en cafeína, que se estima " +
                                        "entre un 1,5% y 1,7%. En algunos foros está catalogado como un Gourmet Coffee.";
                                Intent intent = new Intent(MainActivity.this, Expertocafetalero.class);
                                intent.putExtra("datos", text);
                                startActivity(intent);
                            }
                            else if (parent.getItemAtPosition(i).equals("Robusta (Coffe Canephora)")){
                                String text = "La variedad de café Robusta es originaria del África Central, " +
                                        "ya que crece en ecosistemas secos, lo que influye en su característico " +
                                        "sabor amargo y con mucho cuerpo. Su sabor suele tener matices de frutos secos y madera. ";
                                Intent intent = new Intent(MainActivity.this, Expertocafetalero.class);
                                intent.putExtra("datos", text);
                                startActivity(intent);
                            }
                            else if (parent.getItemAtPosition(i).equals("Libérica (Coffe Libérica)")){
                                String text = "Esta variedad es originaria de Monrovia (Liberia), " +
                                        "de donde toma su nombre. El aroma y sabor de este grano de " +
                                        "café es muy peculiar, por lo que su consumo está muy poco extendido, " +
                                        "se centra principalmente en los países Escandinavos.";
                                Intent intent = new Intent(MainActivity.this, Expertocafetalero.class);
                                intent.putExtra("datos", text);
                                startActivity(intent);
                            }
                            else if (parent.getItemAtPosition(i).equals("Excelsa (Coffe Excelsa)")){
                                String text = "Su origen está fechado sobre 1905 en la región semiárida  del Lago Chad (África). " +
                                        "Guarda grandes similitudes con el café Liberiano, en lo que respecta al tamaño del árbol " +
                                        "y de sus hojas. Sin embargo, tanto sus flores como sus frutos y hojas tienen un tamaño " +
                                        "sensiblemente menor.";
                                Intent intent = new Intent(MainActivity.this, Expertocafetalero.class);
                                intent.putExtra("datos", text);
                                startActivity(intent);
                            }
                        }
                    });
                }
            }
        });

    }
}