package com.example.atividadecardview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val filmesList = listOf(
        Filmes("Back to Black", "Considerada uma das histórias mais trágicas da música nos últimos " +
                "20 anos, Amy Winehouse teve uma carreira meteórica, e com apenas dois " +
                "álbuns foi reconhecida como uma das grandes novas vozes do soul e R&B. " +
                "Sua história será contada em Back to Black, que deve abordar a vida da " +
                "cantora e seus problemas com o abuso de drogas que a levaram à morte em " +
                "2011.\n" +
                "\n" +
                "Estrelado por Marisa Abela (Barbie), o filme ainda traz Jack O'Connell (Ferrari), " +
                "Eddie Marsan (Atômica) e Lesley Manville (The Crown).\n" +
                "\n" +
                "Back to Black tem previsão de estreia para o dia 9 de maio.", R.drawable.blacktoblack),
        Filmes("Garfield: Fora de Casa", "Depois de alguns filmes que misturavam atores " +
                "com versões em computação gráfica do felino, o gato preguiçoso retorna aos cinemas em " +
                "Garfield: Fora de Casa. Após reencontrar seu pai que há muito tempo " +
                " estava perdido, Garfield e o cachorro Odie são forçados a sair de suas vidas tranquilas " +
                "dentro de casa e se juntam a ele em um perigoso assalto.\n" +
                "\n" +
                "Na versão em inglês, Garfield é dublado por Chris Pratt (Super Mario Bros - O Filme), " +
                "enquanto seu pai, Vic, é dublado pelo Samuel L. Jackson. O filme ainda traz " +
                "outras vezes famosas, como Hannah Waddingham (Ted Lasso), Nicholas Hoult " +
                "(Superman Legacy) e Brett Goldstein (Ted Lasso).\n" +
                "\n" +
                "Garfield: Fora de Casa estreia dia 23 de maio.", R.drawable.garfield),
        Filmes("Divertida Mente 2", "Divertida Mente 2 traz de volta a jovem Riley, agora uma " +
                "adolescente, e os diferentes sentimentos como Alegria, Raiva, Medo, " +
                "Nojo e Tristeza. A novidade está na chegada de outros sentimentos, " +
                "como Vergonha, Inveja e Tédio. O destaque fica mesmo para a chegada da " +
                "Ansiedade, no original dublado pela atriz Maya Hawke (Stranger Things). \n" +
                "\n" +
                "Divertida Mente 2 estreia dia 13 de junho.", R.drawable.divertidamente),
        Filmes("Deadpool 3", "A grande (e única) aposta do Marvel Studios para os cinemas em 2024, " +
                "Deadpool 3 traz novamente o falastrão anti-herói em sua primeira aventura no " +
                "Universo Cinematográfico da Marvel (MCU, na sigla em inglês). A grande sacada do" +
                "filme é brincar com o multiverso e prestar uma última homenagem às adaptações " +
                "da Fox, trazendo de volta Hugh Jackman como Wolverine, com direito a finalmente" +
                " colocar o ator no uniforme amarelo do personagem.\n" +
                "\n" +
                "Novamente estrelado por Ryan Reynolds, o filme promete ser o início do fim da " +
                "saga do multiverso, começando a juntar de vez as linhas de história que " +
                "culminarão em Vingadores: Guerras Secretas — pelo menos é o que a gente espera.\n" +
                "\n" +
                "Deadpool 3 tem previsão de estreia para o dia 25 de julho.", R.drawable.deadpool),
        Filmes("Coringa 2", "Coringa foi um sucesso absurdo nos cinemas, " +
                "dando ao público uma nova versão do Palhaço do Crime e rendendo um Oscar " +
                "de Melhor Ator a Joaquin Phoenix. Sua sequência, que deve ser um musical, " +
                "tem como grande atrativo a introdução de Harleen Quinzel, a Arlequina, que " +
                "será interpretada pela Lady Gaga.\n" +
                "\n" +
                "É o tipo de filme que pode dar muito certo ou muito errado, o que apenas o " +
                "torna ainda mais imperdível. Além da dupla principal, o filme traz Brandan " +
                "Gleeson (Os Banshees de Inisherin), Zazie Beetz (Deadpool 2) e Catherine " +
                "Keener (Corra!).\n" +
                "\n" +
                "Coringa 2 tem estreia prevista para o dia 3 de outubro.", R.drawable.coringa2)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = FilmesAdapter(filmesList)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = FilmesAdapter(filmesList)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = adapter
        }
    }
}
