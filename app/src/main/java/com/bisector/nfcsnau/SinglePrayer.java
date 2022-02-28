package com.bisector.nfcsnau;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class SinglePrayer extends AppCompatActivity {
TextView txt,text;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_prayer);
        if(Build.VERSION.SDK_INT>=21){
            getWindow().setNavigationBarColor(ContextCompat.getColor(SinglePrayer.this,R.color.purple_500));
        }
        txt=findViewById(R.id.txt);
        text=findViewById(R.id.text);
        Intent i=getIntent();
        String name=i.getStringExtra("key");
        switch (name){
            case "NFCS Daily Prayer":
                text.setText(name);
                txt.setText(
                        "Lord God, we offer you all our daily activities" +
                        " in joy and in sorrow. Bless and put under your divine" +
                        " illumination all Nigerian Catholic Students: to know you," +
                        " to love you, to serve you and to walk with you all that we" +
                        " learn do or say. Bestow on us the grace and strength to live" +
                        " our faith in your son, Jesus Christ and to be guided by the" +
                        " power of the Holy Spirit, to work for truth and faithfully" +
                        " witness you among all students. In truth and love- Guide us " +
                        "through life and bring our paths, learning and purposes to their" +
                        " successful ends. This we ask through Christ Our Lord. Amen.\n" +
                        "\n" +
                        "CONCLUDING PRAYER\n" +
                        "V. Most Sacred Heart of Jesus \n" +
                        "R. Bless and sanctify all NFCSers\n" +
                        "V. Most Sacred Heart of Jesus \n" +
                        "R. Enlighten all NFCSers\n" +
                        "V. Most Sacred Heart of Jesus \n" +
                        "R Grant Success to all NFCSers\n" +
                        "V. Immaculate Heart of Mary\n" +
                        "R. Pray for us\n" +
                        "V. May the souls of all departed NFCSers rest\n" +
                        "in perfect peace \n" +
                        "And may they reign with you forever and ever. \n" +
                        "Amen.");
                return;
            case "Ekpere Ubochi Nile nke ndi NFCS":
                text.setText(name);
                txt.setText("Dinwenu Chineke, anyi enye gi mmemme ubochi anyi nille, n'añuri na iru uju. Gozie ma dote n'okpuru ihe ibu Chukwu gi, umu-akwukwo katolik niile nke Naijiria, iji mara gi, hu gi n'anya, fee gi ma sonyekwara gi n'ihe niile nke anyi na-eme ma o bu nke anyi na-ekwu.\n" +
                        "\n" +
                        "Nye anyi Amara na ike iji gosiputa okwukwe anyi na ime nwa gi Jesu Kristi ka ike nke mmuo nso na edu anyi iji ruo oru maka eziokwu, ma gba ezi akaebe banyere gi n'etiti umuakwukwo niile n'eziokwu na ihunanya. Duo anyi n'ndu a ma weta uzo omumu ihe na ebumnuche anyi n'nedebe di mma. Nke a k'anyi na ario site na Jesu Kristi dinwenu anyi Amen.\n" +
                        "\n" +
                        "Obi Jesu kasi nso    -   Gozie ma doo ndi NFCS niile no\n" +
                        "Obi Jesu kasi nso    -   Gbasiere ndi NFCS niile HT OTAMYH\n" +
                        "Obi jesu kasi nso     -    Nye ndi NFCS niile Agamnihu 1208\n" +
                        "Obi Maria n'eburo njo     -     Riobara anyi aririo\n" +
                        "Albert di great di nso    -    Riobara anyi aririo\n" +
                        "Joseph onye oru di nso      -      Riobara anyi aririo\n" +
                        "\n" +
                        "V. Ka mkpuru obi ndi NFCS niile kwerenu gara aga zuo ike n;ndokwa,\n" +
                        "\n" +
                        "R.. ka ha sonyekwara gi ebebe ebebe. Amen");
                return;
            case "Novena to the Holy Spirit":
                text.setText(name);
                //RecyclerView recyclerView;
                recyclerView=findViewById(R.id.recycler);
                arrayadapter adapter;
                ArrayList<array> List_Prayer;
                List_Prayer=new ArrayList<>();
                List_Prayer.add(new array("HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME"));
                List_Prayer.add(new array("Day One"));
                List_Prayer.add(new array("Day Two"));
                List_Prayer.add(new array("Day Three"));
                List_Prayer.add(new array("Day Four"));
                List_Prayer.add(new array("Day Five"));
                List_Prayer.add(new array("Day Six"));
                List_Prayer.add(new array("Day Seven"));
                List_Prayer.add(new array("Day Eight"));
                List_Prayer.add(new array("Day Nine"));
                RecyclerView.LayoutManager layoutManager;
                layoutManager = new LinearLayoutManager(this);
                adapter = new arrayadapter(List_Prayer);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(adapter);
                adapter.setOnClickListener(new arrayadapter.OnItemClickListener() {
                    @Override
                    public void OnItemClick(int position) {
                        array arr=List_Prayer.get(position);
                        String lis = arr.getList();
                        Intent i=new Intent(SinglePrayer.this,SinglePrayer.class);
                        switch (lis){
                            case "HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME":
                                i.putExtra("key","HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME");
                                startActivity(i);
                                return ;
                            case "Day One":
                                i.putExtra("key","Day One");
                                startActivity(i);
                                return ;
                            case "Day Two":
                                i.putExtra("key","Day Two");
                                startActivity(i);
                                return ;
                            case "Day Three":
                                i.putExtra("key","Day Three");
                                startActivity(i);
                                return ;
                            case "Day Four":
                                i.putExtra("key","Day Four");
                                startActivity(i);
                                return ;
                            case "Day Five":
                                i.putExtra("key","Day Five");
                                startActivity(i);
                                return ;
                            case "Day Six":
                                i.putExtra("key","Day Six");
                                startActivity(i);
                                return ;
                            case "Day Seven":
                                i.putExtra("key","Day Seven");
                                startActivity(i);
                                return ;
                            case "Day Nine":
                                i.putExtra("key","Day Nine");
                                startActivity(i);
                                return ;
                            case "Day Eight":
                                i.putExtra("key","Day Eight");
                                startActivity(i);
                                return ;
                        }
                        return ;
                    }
                });


            case "HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME":
                text.setText(name);
                txt.setText("1. Come, Holy Ghost, Creator, come \nFrom thy bright heavenly throne\n Come, take possession of our souls\n And make them all thy own.\n" +
                        "\n" +
                        "2. Thou who art called the Paraclete,\n Best gift of God above,\n The living spring, the living fire,\n Sweet unction and true love.\n" +
                        "\n" +
                        "3. Thou who are sev'n fold in thy grace,\n Finger of God's right hand.\n His promise, teaching little ones,\n To speak and understand.\n" +
                        "\n" +
                        "4. O guide our minds with thy blest light,\n With love our hearts inflame;\n And with thy strength which ne'er decays\n Confirm our mortal frame.\n" +
                        "\n" +
                        "5. Far from us drive our deadly foe;\n true peace unto us bring;\n And through all perils lead us safe,\n Beneath the sacred wing.\n" +
                        "\n" +
                        "6. Through thee may we the father know,\n Through thee the eternal Son,\n And thee the spirit of them both,\n Thrice-blessed three in one\n" +
                        "\n" +
                        "7. All glory to the father be,\n With His co-equal Son,\n The same to thee, great Paraclete,\n While endless ages run");
                return ;
            case "Day One":
                text.setText(name+"\n Friday, 6th Week of Easter");
                recyclerView=findViewById(R.id.recycler);
                arrayadapter adapte;
                ArrayList<array> List_Praye;
                List_Praye=new ArrayList<>();
                List_Praye.add(new array("HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME"));
                List_Praye.add(new array("Scripture Reading (Stand)"));
                List_Praye.add(new array("Reflection (Sit)"));
                List_Praye.add(new array("Litany to the Holy Spirit (Kneel)"));
                List_Praye.add(new array("Novena Prayer"));
                List_Praye.add(new array("Prayer to the Holy Spirit"));
                RecyclerView.LayoutManager layoutManage;
                layoutManage = new LinearLayoutManager(this);
                adapte= new arrayadapter(List_Praye);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManage);
                recyclerView.setAdapter(adapte);
                adapte.setOnClickListener(new arrayadapter.OnItemClickListener() {
                    @Override
                    public void OnItemClick(int position) {
                        array arr=List_Praye.get(position);
                        String lis = arr.getList();
                        Intent i=new Intent(SinglePrayer.this,SinglePrayer.class);
                        switch (lis){
                            case "HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME":
                                i.putExtra("key","HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME");
                                startActivity(i);
                                return ;
                            case "Scripture Reading (Stand)":
                                i.putExtra("key","Scripture Reading (Stand)");
                                startActivity(i);
                                return ;
                            case "Reflection (Sit)":
                                i.putExtra("key","Reflection (Sit)");
                                startActivity(i);
                                return ;
                            case "Litany to the Holy Spirit (Kneel)":
                                i.putExtra("key","Litany to the Holy Spirit (Kneel)");
                                startActivity(i);
                                return ;
                            case "Novena Prayer":
                                i.putExtra("key","Novena Prayer");
                                startActivity(i);
                                return ;
                            case "Prayer to the Holy Spirit":
                                i.putExtra("key","Prayer to the Holy Spirit");
                                startActivity(i);
                                return ;
                        }
                        return ;
                    }
                });
                return ;
            case "Day Two":
                text.setText(name+"\n Saturday, 6th Week of Easter");
                recyclerView=findViewById(R.id.recycler);
                arrayadapter adapt;
                ArrayList<array> List_Pray;
                List_Pray=new ArrayList<>();
                List_Pray.add(new array("HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME"));
                List_Pray.add(new array("Scripture Reading (Stand)"));
                List_Pray.add(new array("Reflection (Sit)"));
                List_Pray.add(new array("Litany to the Holy Spirit (Kneel)"));
                List_Pray.add(new array("Novena Prayer"));
                List_Pray.add(new array("Prayer to the Holy Spirit"));
                RecyclerView.LayoutManager layoutManag;
                layoutManag = new LinearLayoutManager(this);
                adapt= new arrayadapter(List_Pray);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManag);
                recyclerView.setAdapter(adapt);
                adapt.setOnClickListener(new arrayadapter.OnItemClickListener() {
                    @Override
                    public void OnItemClick(int position) {
                        array arr=List_Pray.get(position);
                        String lis = arr.getList();
                        Intent i=new Intent(SinglePrayer.this,SinglePrayer.class);
                        switch (lis){
                            case "HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME":
                                i.putExtra("key","HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME");
                                startActivity(i);
                                return ;
                            case "Scripture Reading (Stand)":
                                i.putExtra("key","Scripture Reading (Stand)");
                                startActivity(i);
                                return ;
                            case "Reflection (Sit)":
                                i.putExtra("key","Reflection (Sit)");
                                startActivity(i);
                                return ;
                            case "Litany to the Holy Spirit (Kneel)":
                                i.putExtra("key","Litany to the Holy Spirit (Kneel)");
                                startActivity(i);
                                return ;
                            case "Novena Prayer":
                                i.putExtra("key","Novena Prayer");
                                startActivity(i);
                                return ;
                            case "Prayer to the Holy Spirit":
                                i.putExtra("key","Prayer to the Holy Spirit");
                                startActivity(i);
                                return ;
                        }
                        return ;
                    }
                });
                return ;
            case "Day Three":
                text.setText(name+"\n Sunday, 7th Sunday of Easter");
                recyclerView=findViewById(R.id.recycler);
                arrayadapter adap;
                ArrayList<array> List_Pra;
                List_Pra=new ArrayList<>();
                List_Pra.add(new array("HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME"));
                List_Pra.add(new array("Scripture Reading (Stand)"));
                List_Pra.add(new array("Reflection (Sit)"));
                List_Pra.add(new array("Litany to the Holy Spirit (Kneel)"));
                List_Pra.add(new array("Novena Prayer"));
                List_Pra.add(new array("Prayer to the Holy Spirit"));
                RecyclerView.LayoutManager layoutMana;
                layoutMana = new LinearLayoutManager(this);
                adap= new arrayadapter(List_Pra);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutMana);
                recyclerView.setAdapter(adap);
                adap.setOnClickListener(new arrayadapter.OnItemClickListener() {
                    @Override
                    public void OnItemClick(int position) {
                        array arr=List_Pra.get(position);
                        String lis = arr.getList();
                        Intent i=new Intent(SinglePrayer.this,SinglePrayer.class);
                        switch (lis){
                            case "HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME":
                                i.putExtra("key","HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME");
                                startActivity(i);
                                return ;
                            case "Scripture Reading (Stand)":
                                i.putExtra("key","Scripture Reading (Stand)");
                                startActivity(i);
                                return ;
                            case "Reflection (Sit)":
                                i.putExtra("key","Reflection (Sit)");
                                startActivity(i);
                                return ;
                            case "Litany to the Holy Spirit (Kneel)":
                                i.putExtra("key","Litany to the Holy Spirit (Kneel)");
                                startActivity(i);
                                return ;
                            case "Novena Prayer":
                                i.putExtra("key","Novena Prayer");
                                startActivity(i);
                                return ;
                            case "Prayer to the Holy Spirit":
                                i.putExtra("key","Prayer to the Holy Spirit");
                                startActivity(i);
                                return ;
                        }
                        return ;
                    }
                });
                return ;
            case "Day Four":
                text.setText(name+"\n Monday, 7th Week of Easter");
                recyclerView=findViewById(R.id.recycler);
                arrayadapter adapterr;
                ArrayList<array> List_Prayerr;
                List_Prayerr=new ArrayList<>();
                List_Prayerr.add(new array("HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME"));
                List_Prayerr.add(new array("Scripture Reading (Stand)"));
                List_Prayerr.add(new array("Reflection (Sit)"));
                List_Prayerr.add(new array("Litany to the Holy Spirit (Kneel)"));
                List_Prayerr.add(new array("Novena Prayer"));
                List_Prayerr.add(new array("Prayer to the Holy Spirit"));
                RecyclerView.LayoutManager layoutManagerr;
                layoutManagerr = new LinearLayoutManager(this);
                adapterr= new arrayadapter(List_Prayerr);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManagerr);
                recyclerView.setAdapter(adapterr);
                adapterr.setOnClickListener(new arrayadapter.OnItemClickListener() {
                    @Override
                    public void OnItemClick(int position) {
                        array arr=List_Prayerr.get(position);
                        String lis = arr.getList();
                        Intent i=new Intent(SinglePrayer.this,SinglePrayer.class);
                        switch (lis){
                            case "HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME":
                                i.putExtra("key","HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME");
                                startActivity(i);
                                return ;
                            case "Scripture Reading (Stand)":
                                i.putExtra("key","Scripture Reading (Stand)");
                                startActivity(i);
                                return ;
                            case "Reflection (Sit)":
                                i.putExtra("key","Reflection (Sit)");
                                startActivity(i);
                                return ;
                            case "Litany to the Holy Spirit (Kneel)":
                                i.putExtra("key","Litany to the Holy Spirit (Kneel)");
                                startActivity(i);
                                return ;
                            case "Novena Prayer":
                                i.putExtra("key","Novena Prayer");
                                startActivity(i);
                                return ;
                            case "Prayer to the Holy Spirit":
                                i.putExtra("key","Prayer to the Holy Spirit");
                                startActivity(i);
                                return ;
                        }
                        return ;
                    }
                });
                return ;
            case "Day Five":
                text.setText(name+"\n Tuesday, 7th Week of Easter");

                return ;
            case "Day Six":
                text.setText(name+"\n Wenesday, 7th Week of Easter");
                return ;
            case "Day Seven":
                text.setText(name+"\n Thursday, 7th Week of Easter");
                return ;
            case "Day Nine":
                text.setText(name+"\n Saturday, 7th Week of Easter");
                return ;
            case "Day Eight":
                text.setText(name+"\n Friday, 7th Week of Easter");
                return ;
            case "The Holy Rosary":
                text.setText(name);
                txt.setText("");
                return;
            case "The Catena Rosary":
                text.setText(name);
                name.toUpperCase();
                txt.setText(Html.fromHtml("<b>"+"Antiphon:"+"</b>"+" Who is she that comes forth as the morning rising," +
                        "<br>" +
                        "R. Fair as the moon, bright as the Sun, terrible as an army set in battle array?<br><br>" +
                        "V. My Soul glorifies the Lord*<br>" +
                        "R. And my Spirit rejoice in God my Saviour V. He looks on his servant in her loneliness,* R. Henceforth all ages will call me blessed. V. The Almighty works marvels for me*<br>" +
                        "R. Holy is His name<br>" +
                        "V. His mercy is from age to age*<br>" +
                        "R. On those who fear Him.<br>" +
                        "V. He puts forth His arms in strength*<br>" +
                        "R. And scatters the proud-hearted<br>" +
                        "V. He casts the mighty from their thrones R. And raises the lowly.<br>" +
                        "V. He fills the starving with good things* R. Sends the rich away empty<br>" +
                        "V. He protects Israel, his servant*<br>" +
                        "R. Remembering His mercy,<br>" +
                        "V. The mercy promised to our fathers,* <br>R. To Abraham and his sons forever. V. Glory be ......................<br>" +
                        "R. And it was<br><br>" +
                        "<b>LET US PRAY</b><br>" +
                        "O Lord Jesus Christ, our Mediator with the Father, who has been pleased to appoint the most Blessed Virgin, thy mother to be our mother also, and our Mediatrix with thee, mercifully grant that whosoever comes to thee seeking thy favours may rejoice to receive all of them through her. Amen.<br><br>" +
                        "<b>Concluding Prayer</b><br>" +
                        "We fly to your patronage, O Holy Mother of God; despise not our prayers in our necessities, but deliver us from all dangers, O glorious and blessed Virgin.<br>" +
                        "V. Mary immaculate, Mediatrix of all graces.<br>" +
                        "R. Pray for us<br>" +
                        "V. St. Michael and St. Gabriel<br>" +
                        "V. All you heavenly powers, Mary's Legion of Angels V. St. John the Baptist<br>" +
                        "V. Saints Peter and Paul<br><br>" +
                        "<b>LET US PRAY</b><br>" +
                        "Confer, O Lord, on us, who serve beneath the standard of Mary, that fullness of faith in you and trust in her, to which it is given to conquer the world: Grant us a lively faith, animated by charity, which will enable us to perform all our actions from the motive of pure love of you, and ever to sec you and serve you in our neighbour; a faith, firm and immovable as a rock, through which we shall rest tranquil and steadfast amid the crosses, toils and disappointments of life; a courageous faith which will inspire us to undertake and carry out" +
                        "without hesitation great things for your glory and for the salvation of souls; a faith which will be our Legion's Pillar of fire-to lead us forth united - to kindle everywhere with the fires of divine love to enlighten those who are in darkness and in the shadow of death- to inflame those who are lukewarm - to bring back life to those who are dead in sin; and which will guide our own feet in the way of peace; so that-the battle of life over-our Legion may reassemble, without the loss of anyone in the kingdom of your love and glory. May the souls of our departed legionaries and the souls of all the faithful departed through the mercy of God rest in peace. Amen."
             ));
                return;
            case "Rosari Di Aso":
                text.setText(name);
                txt.setText("11 Ekpere Mmeghe\n" +
                        "V. N’aha Nna na Nwa na Muo Nso.\n" +
                        "R. Amen.\n" +
                        "V. Bia Muo Nso nojue obi ndi kwerenu R. Munye n’ime ha oku nke ihunanya Gi V. Ziputa Mmuo nke Gi ka e kezie ha. R. I ga-eme ihu nke uwa a ka o di ohuu.\n" +
                        "Aririo\n" +
                        "O Chukwu, onye si n’ihe nke Muo Nso wee kuziere obi ndi kwerenu, mee ka anyi si n’ otu Muo ahu, nwee ezi uche, na-anuri oge niile, site na ntasi obi ya site n’ otu Kristi Dinwenu anyi. Amen.\n" +
                        "V. Ngi, O Dinwenu, ga-ekpughe onu m\n" +
                        "R. Ka ire m wee gbasaa otito Gi\n" +
                        "V. Bia nyere m aka, O Chukwu\n" +
                        "R. Osebruwa gbata oso bia nyere m aka\n" +
                        "V. Otito diri Nna na Nwa na Muo Nso\n" +
                        "R. Etu o di n’ izizi na kitaa na ekpo niile na uwa ebebe. Amen.\n" +
                        "12 Ekwe M Na Chukwu\n" +
                        "Ekwe m na Chukwu, Nna puru ime ihe niile, onye Kelu Eluigwe na ala, ya na Jesu Kristi otu nwa Ya eze anyi. Onye atulu ime ya sitena ike nke Muo Nso, a muo ya na Virgin Maria, o taa ahuhu n’oge nke Pontius Pilate, a kpodo ya n’ obe, o nwuru, e lie ya, o zida na mmuo, n’ubochi\n" +
                        " 26 | P a g e\n" +
                        "nke ato o si na ndi nwuru anwu puta; o rogolu n’eluigwe, o nodu n’aka nri Chukwu Nna, onye puru ime ihe nile, n’ebe ahu ka o ga-esi bia, ga kpee ndi di ndu na ndi nwuru anwu ikpe.\n" +
                        "Ekwe m na mmuo Nso na Nzuko nso Katholik na mmeko nke ndi nso na mgbaghalu nke njo na mbilite n’onwu nke ahu na ndu ebebe. Amen.\n" +
                        "13. Nna Anyi no n’Eluigwe\n" +
                        "Nna anyi no n’eluigwe, ka otito diri aha gi. Ka ochichi gi bia, ka e mee uche gi n’uwa ka e si eme ya n’eluigwe.\n" +
                        "Nye anyi tata nri nke ubochi anyi, gbaghalu anyi mmehie anyi ga, dika anyi si gbaghalu ndi mehielu anyi. E kwena ka anyi kwenye na nlanye, ma zoputa anyi n’ajo ihe. Amen.\n" +
                        "14. Ekene Maria\n" +
                        "Ekene Maria, juputalu na gratia, Oseburuwa nonyelu gi, I di ngozi n’etiti ikporo nile, o diazi ngozi bu nwa afo gi bu Jesu.\n" +
                        "Maria di aso, Nne nke Chukwu, riowalu anyi bu ndi njo aririo, kitaa n’amani onwu anyi. Amen.\n" +
                        "(E Kpesie “Decade” Obula, E Kpee)\n" +
                        "15. O Jesu, gbaghara anyi njo anyi,\n" +
                        "Zoputa anyi n’ahuhu nke oku mmuo; Duga mkpuruobi niile n’eluigwe,\n" +
                        "O kachasi ndi ebere gi kacha mkpa.\n" +
                        "16. Ife Omimi nke Anuri\n" +
                        "Ch: Ezenwanyi, O Maria, I bu nne nke ora niile; nulu, nara ihe omimi nke a, ukwe na ekpere nke anyi.\n" +
                        "1. Ka anyi lo ka Muo oma Gabriel, si kene Virgin Maria;\n" +
                        "I juputalu n’amala,\n" +
                        "I ga-abu nne nke Jesu.\n" +
                        "Ezenwanyi...\n" +
                        "2. Ka Muo oma gwalu Maria, na Elizabeth aturugo ime,\n" +
                        "o gasie ike ka o gaa hu ya, nonyelu ya onwa ato.\n" +
                        "Ezenwanyi...\n" +
                        " 27 | P a g e\n" +
                        "\n" +
                        "3. Ka oge ruru I ji mu nwa, A muputalu Jesu,\n" +
                        "N’ime uchichi na Bethlehem, N’ime ulo anu bu be ha.\n" +
                        "Ezenwanyi...\n" +
                        "4. E kuta Jesu n’ulo Uka, Na mbosi nke nwucha ya;\n" +
                        "Ebe Simeon kenelu, Ma gozie Eze nke uwa.\n" +
                        "Ezenwanyi...\n" +
                        "5. Ka o ruru n’ubochi nke ato E kwudolu Jesu,\n" +
                        "Ka o nonyelu, na-akuzili, Na-aza ndi malu akwukwo.\n" +
                        "Ezenwanyi...\n" +
                        "17. Ife Omimi nke Ihe\n" +
                        "1. Mmiri Chukwu nke Jesu Jon mere Jesu mmiri Chukwu\n" +
                        "N’osimiri nke Jodan;\n" +
                        "Igwe gbaa ama na o bu Kristi: O bu Nwa mere uche Nna.\n" +
                        "Ezenwanyi...\n" +
                        "2. Oriri Agbamakwukwo na Kena Na Kena di na Galili,\n" +
                        "Meri mere Jesu\n" +
                        "Ka o ruo oru ebube nke mbu, Mee mmiri o buru mmanya.\n" +
                        "Ezenwanyi...\n" +
                        "3. Oru Igbasa Alaeze Chineke Jesu biara maka ndi njo,\n" +
                        "Ikwusa alaeze Nna, si: Chegharianu! Oge ezuola, Ma kwerenu n’ozioma.\n" +
                        "Ezenwanyi...\n" +
                        " 28 | P a g e\n" +
                        "\n" +
                        "4. Nnwogha nke Jesu\n" +
                        "Jesu nwoghara onwe ya n’ugwu, Uwe ya na-egbukesi;\n" +
                        "Ya na Elaija na Mosis kwu,\n" +
                        "Ha na-akparita uka.\n" +
                        "Ezenwanyi...\n" +
                        "5. Odido Oriri Nso\n" +
                        "Ka Jesu na ndi umuazu ya\n" +
                        "No na-eri nri ikpeazu,\n" +
                        "O dooro ha Yakaristia\n" +
                        "Ka emee ya na ncheta nke ya.\n" +
                        "Ezenwanyi...\n" +
                        "1. Ka anyi lo na Getsemani, Ka Jesu si ta afufu;\n" +
                        "Ka nwute wutelu ya n’obi, N’osiso mmee nke solu ya.\n" +
                        "18. Ife Omimi nke Afufu\n" +
                        "2. E kedolu Jesu n’ide, N’iru nke mmadu nile\n" +
                        "E zitelu mmadu nkiti, Ka ha pia ya utali.\n" +
                        "Ezenwanyi...\n" +
                        "Ezenwanyi...\n" +
                        "3. Ndi agha kpalu okpu ogwu, Kpube n’isi nke Jesu,\n" +
                        "Ha na akocha Dinwenu anyi, Ekene, Eze ndi Juu.\n" +
                        "Ezenwanyi...\n" +
                        "4. E kpegbue Jesu ka o nwuru, Ka o wee bulu obe di aro,\n" +
                        "Ugboro ato ka o dalu n’ala, N’uzo nke bu so okwute.\n" +
                        "Ezenwanyi...\n" +
                        " 29 | P a g e\n" +
                        "\n" +
                        "5. Ka Jesu ruru Calvary,\n" +
                        "Ndi agha nalu ya akwa ya,\n" +
                        "Ha welu nnukwu ntu igwe, Kpodo Chukwu Nwa n’obe,\n" +
                        "Ezenwanyi...\n" +
                        "19. Ife Omimi nke Otito\n" +
                        "1. Dinwenu anyi Jesu Kristi, Melili onwu n’otito\n" +
                        "O si n’onwu bilite N’uzo mbosi nke ato.\n" +
                        "Ezenwanyi...\n" +
                        "2. Ka oge ruru Ya irapu uwa, Jesu welu otito nke Ya, Rogolu alaeze eluigwe,\n" +
                        "Wee nodu n’aka nri Nna. Ezenwanyi...\n" +
                        "3. K’anyi lo ka Chukwu Muo Nso, Si dakwasi ndi ozi oma, Na-akuziri ha ihe nzuzo,\n" +
                        "Ka Jesu si kwe na nkwa. Ezenwanyi...\n" +
                        "4. Maria si n’uwa niri, Jekwuru nwa ya Jesu,\n" +
                        "Igwe nke ndi muo-oma dulu ya, Ka o batalu n’eluigwe.\n" +
                        "Ezenwanyi...\n" +
                        "5. Ato n’ime otu di ngozi, Kpube Maria okpu,\n" +
                        "Ka o buru eze nwanyi nke ndi muo oma, Ma nke anyi n’uwa ebebe.\n" +
                        "Ezenwanyi...\n" +
                        " 30 | P a g e\n" +
                        "\n" +
                        "20. Ekene Ezenwanyi\n" +
                        "Ekene Ezenwanyi di aso, nne nke ebere, ndu anyi, uso anyi na nchekwube anyi, ekene. Ngi ka anyi bu umu Eve a chupulu achupu na- akpoku. Ngi ka anyi na-ezetelu ume, na-eru uru na-akwa akwa n’uwa anya mmiri nke a. Ya bu rughalikene, o nne na-ekwuru anyi, lekwasi anyi anya ebere gi: ma ekpo oge nchupu anyi ahu galu, gosi anyi Nwa afo gi di ngozi, bu Jesu, O onye di afoma, di ihunanya, di uso bu Virgin Maria.\n" +
                        "V. Riowara anyi aririo O Nne nke Chukwu di aso. R. Ka o wee mee anyi ito nkwa nke Kristi.\n" +
                        "Aririo\n" +
                        "O Chukwu onye so otu Nwa Ya ji ndu Ya, onwu Ya na mbilite n’onwu Ya wee gotere anyi nzoputa ebebe, anyi na-ario gi ebe anyi na-elo maka ihe omimi nke Rosari nke Virgin Maria di aso, ka anyi na-eso ihe di n’ime ya wee nweta ihe ha kwere anyi na nkwa. Sitena Kristi ahu Dinwenu anyi. Amen.\n" +
                        "V. Obi Jesu kasi nso,\n" +
                        "R. Meere anyi ebere.\n" +
                        "V. Obi Maria dikarisiri ocha,\n" +
                        "R. Riowara anyi aririo.\n" +
                        "V. Joseph di aso,\n" +
                        "R. Riowara anyi aririo.\n" +
                        "V. Louis Maria De Monfort di aso, R. Riowara anyi aririo.\n" +
                        "21. Litani nke Virgin Maria Di Ngozi\n" +
                        "V. Osebruwa mere anyi ebere R. Osebruwa mere anyi ebere V. Kristi mere anyi ebere\n" +
                        "R. Kristi mere anyi ebere\n" +
                        "V. Osebruwa mere anyi ebere\n" +
                        "R. Osebruwa mere anyi ebere\n" +
                        "V. Kristi nuru onu anyi,\n" +
                        "R. Kristi nuru aririo anyi\n" +
                        "Chukwu Nna nke eluigwe - Chukwu Nwa onye mgbaputa nke uwa\n" +
                        "Mere anyi ebere\n" +
                        " 31 | P a g e\n" +
                        "\n" +
                        "Chukwu Muo Nso\n" +
                        "Ato n’ime otu di ngozi so otu Chukwu\n" +
                        "Maria di aso,\n" +
                        "Nne nke Chukwu di aso,\n" +
                        "Virgin di aso n’etiti virgin nile,\n" +
                        "Nne Kristi,\n" +
                        "Nne nke nzuko,\n" +
                        "Nne nke ebere\n" +
                        "Nne nke onye wetara amala,\n" +
                        "Nne nke Nchekwube\n" +
                        "Nne dikarisiri obi ocha,\n" +
                        "Nne emerughi emeru,\n" +
                        "Nne arughi aru,\n" +
                        "Nne kwesiri ihunanya,\n" +
                        "Nne kwesiri itu n’anya,\n" +
                        "Nne na-adu ezigbo odu,\n" +
                        "Nne nke onye okike,\n" +
                        "Nne nke onye nzoputa anyi,\n" +
                        "Virgin nwenarisiri uche,\n" +
                        "Virgin kwesiri nsopuru,\n" +
                        "Virgin kwesiri iwu ewu,\n" +
                        "Virgin nwenarisiri ike,\n" +
                        "Virgin nwere obi ebere,\n" +
                        "Virgin jidere okwukwe,\n" +
                        "Ugogbe nke ezi omume,\n" +
                        "Ukpo amamihe,\n" +
                        "Isi anuri anyi,\n" +
                        "Ngi onye juputara n’amala,\n" +
                        "Ngi onye tosiri nsopuru karia,\n" +
                        "Ngi onye juputara na nsopuru n’ebe Chukwu no, Ifuru rose di omimi\n" +
                        "Ulo nche David,\n" +
                        "Ulo nche odu,\n" +
                        "Ulo ola edo,\n" +
                        "Ugbo nke agba,\n" +
                        "Onuzo nke eluigwe,\n" +
                        "Kpakpando nke ututu,\n" +
                        "Ahu ike ndi oria,\n" +
                        "Onye ogbugbo ndi njo,\n" +
                        "- Riobara anyi aririo\n" +
                        "\n" +
                        "Onye nkasiobi ndi mbiambia Onye ntasi obi ndi no n’ahuhu, Inye aka ndi otu Kristi\n" +
                        "Eze Nwanyi ndi muo oma, Eze Nwanyi ndi amuma,\n" +
                        "Eze Nwanyi ndi ozi oma,\n" +
                        "Eze Nwanyi ndi nna ukwu,\n" +
                        "Eze Nwanyi ndi egburu egbu maka Chukwu, Eze Nwanyi ndi na-ekwuputa okwu Chukwu, Eze Nwanyi nke Virgin nile,\n" +
                        "Eze Nwanyi ndi nile di nso,\n" +
                        "Eze Nwanyi a turu ime ya na-ejighi njo,\n" +
                        "Eze Nwanyi e bugolu n’eluigwe,\n" +
                        "Eze Nwanyi nke Rosary dikarisiri nso,\n" +
                        "Eze Nwanyi nke ndokwa.\n" +
                        "Nwa Aturu nke Chukwu onye kpochapuru njo nke uwa; Wepu opipia diri anyi Dinwenu anyi.\n" +
                        "Nwa Aturu nke Chukwu onye kpochapuru njo nke uwa; Nuru aririo anyi Dinwenu anyi.\n" +
                        "Nwa Aturu nke Chukwu onye kpochapuru njo nke uwa; Meere anyi ebere.\n" +
                        "V. Riobara anyi aririo O Nne nke Chukwu di aso R. K’ O wee megoo anyi itolu nkwa nke Kristi.\n" +
                        "ARIRIO\n" +
                        "Anyi na-ario Gi, O Oseburuwa Chukwu, Ka I nye anyi bu umu odibo Gi ahu ike nke muo na nke ahu oge niile, ka anyi site n'aririo nke Maria di ngozi Vejin okpu nweta nzoputa n'ahuhu niile nke ndu a ma nwetakwa anuri ebebe n'uwa ozo.\n" +
                        "Chukwu ji ike niile di ebebe, onye naani Ya na-aru oru itunanya, hukwasi umu Gi onymye muo nzoputa Gi, ka ha nwee ike ime ihe na- aso Gi. Hukwasikwa ha igirigi ngozi Gi oge niile.\n" +
                        "Nuru, O Oseburuwa, aririo anyi ji umeala ario ma kwuba umu odibo Gi n'uzo nzoputa Gi: K’ I site kwuazi n'enyemaka Gi naputa ha n’ ihe mgbakasi ahu nile nke ndu a, site na Kristi Dinwenu anyi. Amen.");
                return;
            case "Fifteen promises of Mary to Christains who recite the rosary":
                text.setText(name);
                txt.setText("");
                return;
            case "Act of Consecration to the Immaculate Heart of Mary":
                text.setText(name);
                txt.setText("");
                return;
            case "Memorare":
                text.setText(name);
                txt.setText("");
                return;
            case "Angelus":
                text.setText(name);
                txt.setText("");
                return;
            case "Regina Ceali":
                text.setText(name);
                txt.setText("");
                return;
            case "Chaplet of Divine Mercy":
                text.setText(name);
                txt.setText("");
                return;
            case "Act of consecration to the Sacred Heart of Jesus":
                text.setText(name);
                txt.setText("");
                return;
            case "Litany of the Sacred Heart of Jesus":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer to St. Joseph (October)":
                text.setText(name);
                txt.setText("");
                return;
            case "Aririo a na-ario Joseph di aso":
                text.setText(name);
                txt.setText("");
                return;
            case "Daily Prayer of Purgatorian":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer to St. Michael":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer to Our Guardian Angel":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer for Study":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer for Knowledge":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer for Examination":
                text.setText(name);
                txt.setText("");
                return;
            case "Grace for Hard Work":
                text.setText(name);
                txt.setText("");
                return;

            case "For Self Control":
                text.setText(name);
                txt.setText("");
                return;
            case "For Courage":
                text.setText(name);
                txt.setText("");
                return;
            case "For Eternal Life":
                text.setText(name);
                txt.setText("");
                return;
            case "For Faith":
                text.setText(name);
                txt.setText("");
                return;
            case "For the Poor":
                text.setText(name);
                txt.setText("");
                return;
            case "For our Country":
                text.setText(name);
                txt.setText("");
                return;
            case "For Priests":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer for a Good Christian Life":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer to Jesus Crucified":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer for Daily Neglects":
                text.setText(name);
                txt.setText("");
                return;
            case "The Spiritual Communion":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayers Before and After Meals":
                text.setText(name);
                txt.setText("");
                return;
            case "Act of Faith":
                text.setText(name);
                txt.setText("");
                return;
            case "Act of Hope":
                text.setText(name);
                txt.setText("");
                return;
            case "Act of Charity":
                text.setText(name);
                txt.setText("");
                return;
            case "A Short Table of Sin on the Commandments":
                text.setText(name);
                txt.setText("");
                return;
            case "Method of Confession":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer Before Confession":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer after Confession":
                text.setText(name);
                txt.setText("");
                return;
            case "Confiteor":
                text.setText(name);
                txt.setText("");
                return;
            case "Act of Contrition":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer before a Crucifix":
                text.setText(name);
                txt.setText("");
                return;
            case "Ejaculations":
                text.setText(name);
                txt.setText("");
                return;
            case "Lord Jesus":
                text.setText(name);
                txt.setText("");
                return;
            case "The Universal Prayer":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer to obtain the graces of all worlds' masses":
                text.setText(name);
                txt.setText("");
                return;
            case "Grace derived from assisting/participating at mass":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayers before Holy Communion":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayers after Holy Communion":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer of St. Thomas Aquinas after Holy Communion":
                text.setText(name);
                txt.setText("");
                return;
            case "Anima Christi":
                text.setText(name);
                txt.setText("");
                return;
            case "Preparation for Mass (Prayer of St. Thomas Aquinas)":
                text.setText(name);
                txt.setText("");
                return;
            case "The New Order of Mass with Congregation (In English)":
                text.setText(name);
                txt.setText("");
                return;
            case "Order of Mass (In Latin)":
                text.setText(name);
                txt.setText("");
                return;
            case "Usoro Emume Misa":
                text.setText(name);
                txt.setText("");
                return;
            case "The Benedictus":
                text.setText(name);
                txt.setText("");
                return;
            case "The Magnificat (English & Igbo)":
                text.setText(name);
                txt.setText("");
                return;
            case "Prayer to our Lord in Character of King in":
                text.setText(name);
                txt.setText("");
                return;
            case "Blessed Sacrament.":
                text.setText(name);
                txt.setText("");
                return;
            case "Benediction (Latin & English)":
                text.setText(name);
                txt.setText("");
                return;
            case "Benediction (In Igbo)":
                text.setText(name);
                txt.setText("");
                return;
            case "The Stations of the Cross":
                text.setText(name);
                txt.setText("");
                return;
            case "Hymns for Stations of the Cross":
                text.setText(name);
                txt.setText("");
                return;
            case "Uzo nke Obe":
                text.setText(name);
                txt.setText("");
                return;
            case "Ukwe Uzo nke Obe":
                text.setText(name);
                txt.setText("");
                return;
            case "The fourteen promises of our Lord via Saint Estanislao":
                text.setText(name);
                txt.setText("");
                return;
            case "Novena devotions in honour of Saint Albert the Great":
                text.setText(name);
                txt.setText("");
                return;
            case "The Itinerarium":
                text.setText(name);
                txt.setText("");
                return;
        }

    }
}
//                txt.setText(Html.fromHtml("<b>HYMN TO THE HOLY GHOST COME, HOLY GHOST CREATOR COME</b> <br>" +
//                        "1. Come, Holy Ghost, Creator, come<br>" +
//                        "   From thy bright heavenly throne<br>" +
//                        "   Come, take possession of our souls" +
//                        "   And make them all thy own. <br><br>" +
//
//                        "2. Thou who art called the Paraclete, <br>" +
//                        "   Best gift of God above,<br>" +
//                        "   The living spring, the living fire,<br>" +
//                        "   Sweet unction and true love. <br>" +
//                        " <br>" +
//                        "3. Thou who are sev'n fold in thy grace,<br>" +
//                        "   Finger of God's right hand.  <br>" +
//                        "   His promise, teaching little ones,  " +
//                        "   To speak and understand. <br>" +
//                        " <br>" +
//                        "4. O guide our minds with thy blest light,<br>" +
//                        "   With love our hearts inflame;<br>" +
//                        "   And with thy strength which ne'er decays   <br>Confirm our mortal frame. <br>" +
//                        " <br>" +
//                        "    5. Far from us drive our deadly foe; <br> true peace unto us bring;  <br>And through all perils lead us safe,   <br>Beneath thy sacred wing. <br>" +
//                        " <br>" +
//                        "    6. Through thee may we the father know, <br> Through thee the eternal Son, <br>" +
//                        " And thee the spirit .of them both, <br>" +
//                        "Thrice-blessed three in one <br>" +
//                        " <br>" +
//                        "    7. All glory to the father be, With His co-equal Son, <br>" +
//                        "The same to thee, great Paraclete, <br>" +
//                        "While endless ages run <br><br>" +
//                        "<b>Day One:</b> Friday, 6th Week of Easter <br>" +
//                        "    <b>1. Hymn to the Holy Spirit (Stand) (See Above)</b> <br>" +
//                        " <br>" +
//                        "    <b>2. Scripture Reading (Stand) </b> <br>" +
//                        "<b>From the Holy Gospel according to John (16:5 -15)</b> <br>" +
//                        "Jesus said to his disciples: Now I am going to the one who sent me. Not one of you has asked, “where are you going?' Yet you are sad at heart because I have told you this. Still, I must tell you the truth: it is for your own good that I am going because unless I go, the Advocate will not come to you; but if I do go, I will send him to you. And when he comes; he will show the world how wrong it was, about sin, and about who was in the right, and about judgment: about sin: proved by their refusal to believe in me; about who was in the right: proved by my going to the Father and you're seeing me no more; about judgment: proved by the prince of this world being already condemned. I still have many things to say to you but they would be too much for you now. But when the Spirit of truth comes he will lead you to the complete truth, since he will not be speaking as from himself but will say only what he has learnt; and he will tell you of the things to come. He will glorify me, since all he tells you will be taken from what is mine. Everything the Father has is mine; that is why I said: All he tells you will be taken from what is mine.<br> The Gospel of the Lord. <br><br>" +
//
//                        "    3. <b>Reflection (Sit) </b><br>" +
//                        "<b>(A priest or deacon gives a homily or the following is read meditatively) </b> <br>" +
//                        "Only one thing is important, eternal salvation. <br>" +
//                        "Only one thing, therefore, is to be feared, sin. <br>" +
//                        "Sin is the result of ignorance, weakness, and indifference. <br>" +
//                        " <br>" +
//                        "The Holy Spirit is the Spirit of Light, of Strength, and of Love. <br>" +
//                        "With His sevenfold gift, <br>" +
//                        "He enlightens the mind,<br>" +
//                        "Strengthens the will,<br> and inflames the heart with love of God. To ensure our salvation,  we ought to invoke the Divine Spirit daily, for “The Spirit helps our infirmity. We know not what we should pray for as we ought. But the Spirit Himself asks for us.” <br>" +
//                        " <br>" +
//                        "<b>4, Litany to the Holy Spirit (kneel)</b><br> Lord, have mercy on us. <br>" +
//                        "Lord, have mercy on us. <br>" +
//                        "Christ, have mercy on us. <br>" +
//                        "Christ, have mercy on us. <br>" +
//                        "Lord, have mercy on us. <br>" +
//                        "Lord, have mercy on us. <br>" +
//                        "God the Father of Heaven. <b>Have mercy on us.</b> <br>" +
//                        "God the Son, Redeemer of the world  <b>Have mercy on us.</b>  <br>" +
//                        "God the Holy Spirit. <b>Have mercy on us.</b> <br> Holy Trinity, One God. <br>" +
//                        "Divine Essence, one true God. <br>" +
//                        "God the Holy Spirit. <b>Have mercy on us.</b> <br>" +
//                        "Holy Trinity, One God. <b>Have mercy on us.</b>  <br>" +
//                        "Divine Essence, one true God. <b>Have mercy on us.</b> <br>" +
//                        "Spirit of truth and wisdom. <b>Have mercy on us.</b>  <br>" +
//                        "Spirit of holiness and justice.  <b>Have mercy on us.</b> <br>" +
//                        "Spirit of understanding and counsel. <b>Have mercy on us.</b>  <br>" +
//                        "Spirit of love and joy. <b>Have mercy on us.</b> <br>" +
//                        "Spirit of peace and patience.  <b>Have mercy on us.</b> <br>" +
//                        "Spirit of longanimity and meekness.  <b>Have mercy on us.</b> <br>" +
//                        "Spirit of benignity and goodness. <b>Have mercy on us.</b> <br>" +
//                        "Love substantial of the Father and the Son.  <b>Have mercy on us.</b>  <br>" +
//                        "Love and life of saintly souls.  <b>Have mercy on us.</b> <br>" +
//                        "Fire ever burning. <b>Have mercy on us.</b> <br>Living water to quench the thirst of hearts <b>Have mercy on us.</b> <br>" +
//                        "From all evil, <br> <b>Deliver us, O Holy Spirit.</b> <br>" +
//                        "From all impurity of soul and body.  <b>Have mercy on us.</b> <br>" +
//                        "From all gluttony and sensuality. <b>Have mercy on us.</b> <br>" +
//                        "From all attachments to the things of the earth. <b>Have mercy on us.</b> <br>" +
//                        "From all hypocrisy and pretense. <b>Have mercy on us.</b> <br> <br>" +
//                        "From all imperfections and deliberate faults. <b>Have mercy on us.</b> <br>" +
//                        "From our own will. <b>Have mercy on us.</b>  <br>" +
//                        "From slander <br>" +
//                        "From deceiving our neighbors. <br>" +
//                        "From our passions and disorderly appetites. <br>" +
//                        "From our inattentivencss to Thy holy inspirations. <br>" +
//                        "From despising little things. <br>" +
//                        "From debauchery and malice. <br>" +
//                        "From love of comfort and luxury. <br>" +
//                        "From wishing to seek or desire anything other than Thee. From everything that displeases Thee.<br> V. Most loving Father  <br>" +
//                        "R. Forgive us. <br>" +
//                        "V. Divine Word  <br>R. Have pity on us. <br>" +
//                        "V. Holy and divine Spirit <br>" +
//                        "R. leave us not until we are in possession of the Divine Essence, Heaven of heavens. <br>" +
//                        "V. Lamb of God, Who takest away the sins of the world,  <br>" +
//                        "R. Send us the divine Consoler. <br>" +
//                        "V. Lamb of God, Who takest away the sins of the world,  <br>" +
//                        "R. Fill us with the gifts of Thy Spirit. <br>" +
//                        "V. Lamb of God, Who takest away the sins of the world,  <br>" +
//                        "R. Make the fruits of the Holy Spirit increase within us. <br>" +
//                        " <br>" +
//                        "    <b>5. Novena Prayer</b><br> Let us pray: <br>" +
//                        "Almighty and eternal God, Who hast vouchsafed to regenerate us by water and the Holy Spirit, and hast given us forgiveness of all our sins, vouchsafe to send forth from heaven upon us Thy sevenfold Spirit, the Spirit of Wisdom and Understanding, the Spirit of Counsel and Fortitude, the Spirit of Knowledge and Piety, and fill us with the Spirit of Holy Fear. Amen. <br>" +
//                        " <br>" +
//                        "   <b> 6. Prayer to the Holy Spirit </b><br>" +
//                        "V. Come, O Holy Spirit, fill the hearts of Thy faith full, <br>" +
//                        "R. And enkindle in them the fire of Thy love. <br>" +
//                        "V. Send forth Thy Spirit and they shall be created, <br>" +
//                        "R. And Thou shal1 renew the face of the earth. <br>" +
//                        "V. Let us pray: <br>" +
//                        "Oh God Who didst instruct the hearts of the faithful by the light of the Holy Spirit, grant us in the same Spirit to be truly wise and to ever rejoice in his consolations, through Jesus Christ Our Lord. Amen. <br>" +
//                        "<b>Day Two:</b> Saturday, 6th Week of Easter <br>" +
//                        "<b>The Gift of Fear</b> <br>" +
//                        "  <b>  1. Hymn to the Holy Spirit (Stand) (See Above) <br>" +
//                        "    2. Scripture Reading (Sit) <br>" +
//                        "A reading from the Book of Psalms (34:9-22) </b><br>" +
//                        "Fear the Lord, you his holy ones: those who fear him want for nothing. The young lion may go empty and hungry, but those who seek the Lord lack nothing good. Come, my sons, Listen to me, I will teach you the fear of God. Which of you wants to live to the full, who loves long life and enjoyment of prosperity? Malice must be banished from your tongue. Deceitful conversation from your lips; never yield to evil, practice good, seek peace, pursue it. The face of God frowns on evil men, to wipe their memory from the earth; the eyes of the Lord are turned towards the virtuous, his ears to their cry. They cry for help and the Lord hears and rescues them from all their troubles; God is near to the brokenhearted, he helps those whose spirit is crushed, hardships in plenty beset the virtuous man, but the Lord rescues him from them all; taking care of every bone, God will not let one be broken. Evil will bring death to the wicked, those who hate the virtuous will have to pay; while the Lord ransoms the souls of his servants, and those who take shelter in him have nothing to pay. <br>" +
//                        "The Word of the Lord. <br>" +
//                        " <br>" +
//                        "<b>3. Reflection </b><br>" +
//                        "(A priest or deacon gives a homily or the following is read meditatively) \n" +
//                        "The gift of Fear fills us with a sovereign respect for God, and makes us dread nothing so much as to offend by sin. It is a fear that arises, not from the thought of hell, but from sentiments of reverence and filial submission to our heavenly Father. \n" +
//                        "It is the fear that is the beginning of wisdom, detaching us from worldly pleasures that could in any way separate us from God. \n" +
//                        "“They that fear the Lord will prepare their hearts, and in His sight will sanctify their souls.” \n" +
//                        " \n" +
//                        "    4. Litany to the Holy Spirit (kneel) (See page 6) \n" +
//                        " \n" +
//                        "    5. Novena Prayer  Let us pray: \n" +
//                        "Come, a blessed Spirit of holy Fear, penetrate my inmost heart, that I may set Thee, my Lord and God, before my luce forever; help me to shun all things that can offend Thee, and make me worthy to appear before the pure eyes of Thy Divine Majesty in heaven, where Thou livest and reignest in the unity of the ever Blessed Trinity, God world without end. \n" +
//                        "Amen. \n" +
//                        " \n" +
//                        "    6. Prayer to the Holy Spirit \n" +
//                        "V. Come, O Holy Spirit, fill the hearts of Thy faithful, \n" +
//                        "R. And enkindle in them the fire of Thy love. \n" +
//                        "V. Send forth Thy Spirit and they shall be created, \n" +
//                        "R. And Thou shall renew the face of the earth. \n" +
//                        "V. Let us pray: \n" +
//                        "Oh God Who didst instruct the hearts of the faithful by the light of the Holy Spirit, grant us in the same Spirit to be truly wise and to ever rejoice in his consolations, through Jesus Christ Our Lord. Amen. \n" +
//                        " \n" +
//                        "Day Three: Sunday, 7th Sunday of Easter \n" +
//                        "The Gift of Piety \n" +
//                        "    1. Hymn to the Holy Spirit (Stand) (Seepage 4) \n" +
//                        "    2. Scripture Reading (Sit) \n" +
//                        "A reading from the Letter of St. Paul to Romans (8: 14- 17,26-27) Every one moved by the Spirit is a son of God The spirit you received is not the spirit of slaves bringing fear into your lives again; it is the spirit of sons, and it makes us cry out, 'Abba, Father!' The Spirit himself and our spirit bear united witness that we arc children of God. And if we are children we arc heirs as well: heirs of God and coheirs with \n" +
//                        "Christ, sharing his sufferings as to share his glory. The Spirit too comes to help us in our weakness. For when we cannot choose words in order to pray properly, the Spirit Himself expresses our plea in a way that could never be put into words, and God who knows everything in our hearts knows perfectly well what he means, and that the pleas of the saints expressed by the Spirit arc according to the mind ofGod. The Word of the Lord. \n" +
//                        " \n" +
//                        "3. Reflection \n" +
//                        "(A priest or deacon gives a homily or the following is read meditatively) \n" +
//                        "The gift of Piety begets in our hearts a filial affection for God as our most loving Father. It inspires us to love and respect for His sake persons and things consecrated toHim, as well as those who are vested with His authority, His blessed Mother and the Saints, the Church and its visible Head, our parents and superiors, our country and its rulers. He who is filled with the gift of piety, not a burdensome duty, but a delightful service. Where there is love, there is no labor. \n" +
//                        " \n" +
//                        "    4. Litany to the Holy Spirit (Kneel) (see page 6) \n" +
//                        " \n" +
//                        "    5. Novena Prayer \n" +
//                        " \n" +
//                        "Let us pray: \n" +
//                        "Come, O Blessed Spirit of Piety, possess my heart. Enkindle therein such a love for God that I may find satisfaction only in His service, and for His sake lovingly submit to all legitimate authority. Amen. \n" +
//                        " \n" +
//                        "    6. Prayer to the Holy Spirit \n" +
//                        "V. Come, O Holy Spirit, fill the hearts of Thy faithful, \n" +
//                        "R. And enkindle, in them the fire of Thy love. \n" +
//                        "V. Send forth Thy Spirit and they shall he created, \n" +
//                        "R. And Thou shall renew the face of the earth. \n" +
//                        "V. Let us pray: \n" +
//                        "Oh God Who didst instruct the hearts of the faithful by the light of the Holy Spirit, grant us in the same Spirit to be truly wise and to ever rejoice in His consolations, through Jesus Christ Our Lord. Amen. \n" +
//                        " \n" +
//                        " \n" +
//                        "Day Four: Monday, 7th Week of Easter  \n" +
//                        "The Gift of Fortitude \n" +
//                        "    1. Hymn to the Holy Spirit (See page 4) \n" +
//                        "    2. Scripture Reading (Sit) \n" +
//                        "A reading from the Letter of St. Paul to Ephesians (6: l 0-20) Finally, grow strong in the Lord, with the strength of his power. Put God's amour on so as to be able to resist the devil's tactics. For, it is not against human enemies that we have to struggle, but against the Sovereignties and thePowers who originate the darkness in this world, the spiritual army of evil in the heavens. That is why you must rely on God's amour, or you will not be able to put up any resistance when the worst happens, or have enough resources to hold your ground. So stand your ground, with truth buckled round your waist, and integrity for a breastplate, wearing for shoes on your feet the eagerness to spread the gospel of peace and always carrying the shield of faith so that you can use it to put out the burning arrows or the evil one. And then you must accept salvation from God to be your helmet and receive the word of God from the Spirit to use as a sword. Pray all the time, asking for what you need, praying in the Spirit on every possible occasion. Never get tired of staying awake to pray for all the saints; and pray for me to be given an opportunity to open my mouth and speak without fear and give out the mystery of the gospel of which I am an ambassador in chains; pray that in proclaiming it may speak as boldly as I ought to. The Word of the Lord. \n" +
//                        " \n" +
//                        "3. Reflection \n" +
//                        "(A priest or deacon gives a homily or the following is read meditatively)  \n" +
//                        "By the gift of Fortitude the soul is strengthened against natural fear, and supported to the end in the performance of duty. Fortitude imparts to the will an impulse and energy which moves it to undertake without hesitancy the most arduous tasks, to face dangers, to trample under foot human respect, and to endure without complaint the slow martyrdom of even lifelong tribulation. “He that shall persevere unto the end, he shall be saved.” \n" +
//                        " \n" +
//                        "    4. Litany to the Holy Spirit (kneel) (See Page 6) \n" +
//                        "    5. Novena Prayer Let us pray: \n" +
//                        "Come, O Blessed Spirit of Fortitude, uphold my soul in times of trouble and adversity, sustain my efforts after holiness, strengthen my weakness, give me courage against all the assaults of my enemies, that I may never be overcome and separated from Thee, my God and greatest Good. \n" +
//                        "Amen. \n" +
//                        " \n" +
//                        "    6. Prayer to the Holy Spirit \n" +
//                        "V. Come, O Holy Spirit, fill the hearts ofThy faithful, \n" +
//                        "R. And enkindle, in them the fire ofThy love. \n" +
//                        "V. Send forth Thy Spirit and they shall be created, \n" +
//                        "R. And Thou shall renew the face of the earth. \n" +
//                        "V. Let us pray: \n" +
//                        "Oh God Who didst instruct the hearts of the faithful by the light of the Holy Spirit, grant us in the same Spirit to be truly wise and to ever rejoice in His consolations, through Jesus Christ Our Lord. Amen. \n" +
//                        " \n" +
//                        "Day Five: Tuesday, 7th Week of Easter  \n" +
//                        "The Gift of Knowledge \n" +
//                        "    1. Hymn to the Holy Spirit (Stand) (See page 4) \n" +
//                        "    2. Scripture Reading (Stand) \n" +
//                        "Areading from the Holy Gospel according to John (14:16-26) Jesus said to his disciples: “I shall ask the Father, and he will give you another Advocate to be with you forever, that Spirit of truth whom the world can never receive since it neither sees nor knows him; but you know him, because he is with you. he is in you. I will not leave you orphans; I will come back to you. In a short time the world will no longer sec me; but you will see me, because I live and you will live. On that day you will understand that I am in my Father and you in me and I in you. Anybody who receives my commandments and keeps them will be one who loves me; and anybody who loves me will beloved by my Father, and I shall love him and show myself to him.” Judas - this was not Judas Iscariot said to him, “Lord, what is all this about? Do you intend to show yourself to us and not to the world?” Jesus replied: “If anyone loves me he will keep my word, and my Father will love him, and we shall come to him and make our home with him. Those who do not love me do not keep my words. And my word is not my own: it is the word of the one who sent me. 1 have said these things to you while still with you; but the Advocate, the Holy Spirit, whom the Father will send in my name, will teach you everything and remind you of all I have said to you.” This is the Gospel of the Lord. \n" +
//                        " \n" +
//                        "    3. Reflection (Sit) \n" +
//                        "(A priest or deacon gives a homily or the following is read meditatively) \n" +
//                        "The gift of Knowledge enables the soul to evaluate created things at their true worth, in relation to God. Knowledge unmasks the pretense of creatures, reveals their emptiness, and points out their only true purpose as instruments in the service of God. It shows us the loving care of God even in adversity, and directs us to glorify Him in every circumstance of life. Guided by its light, we put first things first, and prize the friendship of God beyond all else. “Knowledge is a fountain of life to him that possesseth it.” \n" +
//                        " \n" +
//                        "    4. Litany of the Holy Spirit (Kneel) (See page 6) \n" +
//                        "    5. Novena \n" +
//                        "Come O Blessed Spirit of Knowledge, and grant that I may perceive the will of the Father; show me the nothingness of earthly things, that I may realize their vanity and use them only for Thy glory and my own salvation, looking ever beyond them to Thee, and Thy eternal rewards. Amen. \n" +
//                        " \n" +
//                        "    6. Prayer to the Holy Spirit \n" +
//                        "V. Come, O Holy Spirit, fill the hearts ofThy faithful, \n" +
//                        "R. And enkindle, in them the fire ofThy love. \n" +
//                        "V. Send forth Thy Spirit and they shall be created, R, And Thou shall renew the face of the earth. V. Let us pray: \n" +
//                        "Oh God Who didst instruct the hearts of the faithful by the light of the Holy Spirit, grant us in the same Spirit to be truly wise and to ever rejoice in His consolations, through Christ our Lord. Amen. \n" +
//                        " \n" +
//                        " \n" +
//                        " \n" +
//                        "Day Six: Wednesday, 7th Week of Easter  \n" +
//                        "The Gift of Understanding \n" +
//                        "    1. Hymn to the Holy Spirit (Stand) (See page 4) \n" +
//                        "    2. Scripture Reading (Sit) \n" +
//                        "A reading from the First Letter of St. Paul to Corinthians (12:413) \n" +
//                        "There is a variety of gifts but always the same Spirit; there are all sorts of service to be done, but always to the same Lord; working in all sorts of different ways in different people, it is the same God who is working in all of them. The particular way in which the Spirit is given to each person is for a good purpose. One may have the gift of preaching with wisdom given him by the Spirit; another may have the gift of preaching instruction given him by the same Spirit; and another the gift of faith given by the same Spirit; another again the gift of healing, through this one Spirit; one, the power of miracles; another, prophecy; another the gift of recognizing spirits; another the gift of tongues and another the ability to interpret them. All these are the work of one and the same Spirit who distributes different gifts to different people just as he chooses. Just as human body, though it is made up of many parts, is a single unit because all these parts, though many, make one body, so it is with Christ. In the one Spirit we were all baptized, Jews as well as Greeks, slaves as well as citizens, and one Spirit was given to us all to drink. \n" +
//                        "The Word of the Lord. \n" +
//                        " \n" +
//                        "3. Reflection \n" +
//                        "(A priest or deacon gives homily or the following is read meditatively) \n" +
//                        "Understanding, as a gift of the Holy Spirit, helps us to grasp the meaning of the truths of our holy religion. By faith we know them, but by Understanding we learn to appreciate and relish them. \n" +
//                        "It enables us to penetrate the inner meaning of revealed truths and through them to be quickened to newness of life. Our faith ceases to be sterile and inactive, but inspires a mode of life that bears eloquent testimony to the faith that is in us; we begin to walk worthy of God in all things pleasing, and increasing in the knowledge of God.” \n" +
//                        " \n" +
//                        "    4. Litany to the Holy Spirit (Kneel) (See page 6) \n" +
//                        "    5. Novena Prayer Let us pray: \n" +
//                        "Come, O Spirit of Understanding, and enlighten our minds that, we may know and believe all the mysteries of salvation; and may merit at last to see the eternal light in Thy light; and in the light of glory to have a clear vision of Thee and the Father and the Son. Amen. \n" +
//                        " \n" +
//                        "    6. Prayer to the Holy Spirit* \n" +
//                        "V. Come, O Holy Spirit, fill the hearts of Thy faithful, \n" +
//                        "R. And enkindle in them the fire of Thy love. \n" +
//                        "V. Send forth Thy Spirit and they shall he created, \n" +
//                        "R. And Thou shall renew the face of the earth. \n" +
//                        "V. Let us pray: \n" +
//                        "Oh God Who didst instruct the hearts of the faithful by the light of the Holy Spirit, grant us in the same Spirit to be truly wise and to ever rejoice in his consolations, through Jesus Christ Our Lord. Amen. \n" +
//                        " \n" +
//                        "Day Seven: Thursday, 7th Week of Easter  \n" +
//                        "The Gift of Counsel \n" +
//                        "    1. Hymn to the Holy Spirit (Stand) (See page 4) \n" +
//                        "    2. Scripture Reading (Sit) \n" +
//                        "A reading from the Second Letter of St. Paul to Timothy \n" +
//                        "(1:6-10,13-14) \n" +
//                        "That is why I am reminding you now to fan into a flame the gift that God gave you when I laid my hands on you. God's gift was not a spirit of timidity, but the Spirit of power, and love, and self-control, So you are never to be ashamed of witnessing to the Lord, or ashamed of me for being his prisoner; but with me, bear the hardships for the sake of the Good News, relying on the power of God who has saved us and called us to be holy - not because of anything we ourselves have done hut for his own purpose and by his own grace. This grace had already been granted to us, in Christ Jesus, before the beginning of time, but it has only been revealed by the Appearing of our Saviour Christ Jesus. Keep as your pattern the sound teaching you have heard from me, in the faith and love that are in Christ Jesus. You have been trusted to look after something precious; guard it with the help of the Holy Spirit who lives in us.  \n" +
//                        "The Word of the Lord \n" +
//                        " \n" +
//                        "3. Reflection \n" +
//                        "(A priest or deacon gives a homily or the following is read meditatively) \n" +
//                        "The gift of Counsel endows the soul  with supernatural prudence, enabling it to judge promptly  and rightly what must be done,  especially in difficult circumstances, Counsel applies the principles  furnished by Knowledge and Understanding to the innumerable concrete cases that confront us in the course of our daily duty as parents, teachers, public servants and Christian citizens. Counsel is supernatural common sense, a priceless treasure in the quest of salvation. “Above all these \n" +
//                        "things,pray to the Most High, that he may direct thy way in truth.” \n" +
//                        " \n" +
//                        "4. Litany to the Holy Spirit (Kneel) (See page 6) 5. Novena Prayer Let us pray: \n" +
//                        "Come, o Spirit of Counsel,help and guide me in all my ways, - that I may always do Thy holy will. Incline my heart to that which is good; turn it away from all that is evil,and direct me by the straight path of \n" +
//                        "Thy commandments to that goal of eternal life for which I long. Amen. \n" +
//                        " \n" +
//                        "7. Prayer to the Holy Spirit \n" +
//                        "V. Come, O Holy Spirit, fill the hearts of thy faithful, \n" +
//                        "R. And enkindle, in them the fire of thy love. \n" +
//                        "V. Send forth thy Spirit and they shall be created, \n" +
//                        "R. And Thou shall renew the face of the earth. \n" +
//                        "V. Let us pray: \n" +
//                        "Oh God Who didst instruct the hearts of the faithful by the light of the Holy Spirit, grant us in the same Spirit to be truly wise and to ever rejoice in His consolations, through Jesus Christ Our Lord. Amen \n" +
//                        " \n" +
//                        " \n" +
//                        "Day Eight: Friday, 7th Week of Easter  \n" +
//                        "The Gift of Wisdom \n" +
//                        "    1. Hymn to the Holy Spirit (Stand) See page 4) \n" +
//                        "    2. Scripture Reading (Sit) \n" +
//                        "A reading from the First letter of St. Paul to Corinthians (2:8-16) It is a wisdom that none of the masters of this age have ever known, or they would not have crucified the Lord of Glory; we teach what scripture calls: the things that no eye has seen and no ear has heard, things beyond the mind of man, all that God has prepared for those who love him, These are the very things that God has revealed to us through the Spirit, for the Spirit reaches the depths of everything, even the depths of God. After all, the depths of a man can only be known by his own spirit, not by any other man, and in the same way the depths of God can only be known by the Spirit of God. Now instead of the spirit of the world, we have received the Spirit that comes from God, to teach us to understand the gifts that he has given us. Therefore we teach, not in the way in which philosophy is taught, but in the way that the Spirit teaches us: we teach spiritual things spiritually. An unspiritual person is one who does not accept anything of the Spirit of God: he sees it all as nonsense; it is beyond his understanding because it can only be understood by means of the Spirit. A spiritual man, on the other hand, is able to judge the value of everything, and his own value is not to be judged by other men. As scripture says: Who can know the mind of the Lord, so who can teach him? But we are those who have the mind of Christ. \n" +
//                        "The Word of the Lord. \n" +
//                        " \n" +
//                        " \n" +
//                        "\t3. \tReflection \n" +
//                        "(A priest or deacon gives a homily or the following is read meditatively) \n" +
//                        "Embodying all the other gifts, as charity embraces all other virtues, wisdom is the most perfect of the gifts of wisdom it is written, “all good things came to me with her and innumerable riches through her hands.” It is the gift of Wisdom that strengthens our faith, fortifies hope, perfects charity, and promotes the practice of virtue in the highest degree. Wisdom enlightens the mind to discern and relish things divine, in the appreciation of which earthly joys lose their savor, whilst the Cross of Christ yields a divine sweetness according to the words of the Savior, “Take up thy cross and follow Me, for My yoke is sweet, and \n" +
//                        "My burden light.” \n" +
//                        " \n" +
//                        "    1. Litany of the Holy spirit (kneel) (See page 6) \n" +
//                        "    2. Novena Prayer \n" +
//                        "Let us pray \n" +
//                        "Come, O Spirit of Wisdom, and reveal to my soul the mysteries of heavenly things,  their exceeding greatness, power and beauty. \n" +
//                        "Teach me to love them above and beyond all passing joys and satisfactions of the earth. Help me to attain them and possess them forever. Amen. \n" +
//                        " \n" +
//                        "    3. Prayer to Spirit \n" +
//                        "V. Come. O Holy Spirit, fill the hearts of Thy faithful,  \n" +
//                        "R. And enkindle, in them the fire of Thy love. \n" +
//                        "V Send forth Thy Spirit and they shall be created. R. and Thou shall renew the face of the earth. \n" +
//                        "V. Let us pray: \n" +
//                        "Oh God Who didst instruct the hearts of the faithful by the light of the Holy Spirit, grant us in the same Spirit to be truly wise and to ever rejoice in His consolations, through Jesus Christ Our Lord. Amen. \n" +
//                        " \n" +
//                        "Day Nine: Saturday, 7th Week of Easter \n" +
//                        "The Fruits of the Holy Spirit \n" +
//                        "    1. Hymn to the Holy Spirit (Stand) (see page 4) \n" +
//                        "    2. Scripture Reading (Sit) \n" +
//                        "A reading from the First letter of St. Paul to Galatians (5:16-26) \n" +
//                        "Let me put it like this: if you are guided by the Spirit you will be in no danger of yielding to self-indulgence, since self- indulgence is the opposite of the Spirit, the Spirit is totally against such a thing, and it is precisely because the two are so opposed that you do not always carry out your good intentions. If you are led by the Spirit, no law can touch you. When self-indulgence is at work the results are obvious: fornication, gross indecency and sexual irresponsibility, idolatry and sorcery; feuds and wrangling, jealousy, bad temper and quarrels; disagreements, factions, envy; drunkenness, orgies and similar things. \n" +
//                        "I warn you now, as I warned you before: those who behave like this will not inherit the kingdom of God. What the Spirit brings is very different: love, joy, peace, patience, kindness, goodness, trustfulness, gentleness and self-control. There can be no law against things like that, of course. You cannot belong to Christ Jesus unless you crucify all self-indulgent passions and desires. Since the Spirit is our life, let us be directed by the Spirit. We must stop being conceited, provocative and envious. The Word of the Lord \n" +
//                        " \n" +
//                        "3. Reflection \n" +
//                        "(4 priest or deacon gives a homily or the following is read mediatatively) \n" +
//                        "The gifts of the Holy Spirit perfect the supernatural virtues by enabling us to practice them with greater docility to divine inspiration. As we grow in the knowledge and love of God under the direction of the Holy Spirit our service becomes more sincere and generous the practice of virtue more perfect. Such acts of virtue leave the heart filled with joy and consolation and are known as Fruit of the Holy Spirit. These Fruits in turn render the practice of virtue more attractive and become a powerful incentive for still greater efforts in the service of God, to serve Whom is to reign. \n" +
//                        " \n" +
//                        "    4. Litany to the Holy Spirit (kneel) (See page 6) \n" +
//                        " \n" +
//                        "    5. Novena Prayer Let us pray: \n" +
//                        "Come, O Divine Spirit fill my heart with Thy heavenly fruits, Thy charity, joy, peace, patience, benignity, goodness, faith, mildness, and temperance, that I may never weary in the service of God, but by continued faithful submission to Thy inspiration, may merit to be united eternally with Thee in the love of the Father and the Son. Amen. \n" +
//                        " \n" +
//                        "    6. Prayer to the Holy Spirit \n" +
//                        "V. Come,0 Holy Spirit, fill the hearts of thy faithful,  \n" +
//                        "R. And enkindle in them the fire of thy love. \n" +
//                        "V. Send forth Thy Spirit and they shall be created, \n" +
//                        "R. And Thou shall renew the face of the earth.  \n" +
//                        "V. Let us pray: \n" +
//                        "Oh God Who didst instruct the hearts of the faithful by the light of the Holy Spirit, grant us in the same Spirit to be truly wise and to ever rejoice in His consolations, through Jesus Christ Our Lord. Amen."));
//return;