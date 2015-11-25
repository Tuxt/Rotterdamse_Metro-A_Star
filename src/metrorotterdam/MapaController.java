package metrorotterdam;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import metrorotterdam.aEstrella.AlgoritmoAEstrella;
import metrorotterdam.classes.Arista;
import metrorotterdam.classes.IArista;
import metrorotterdam.classes.Nodo;
import metrorotterdam.classes.Transbordo;

/**
 *
 * @author Tuxt
 */
public class MapaController implements Initializable {
    
    String[] nombres = {"Binnenhof", "Romeynshof", "Graskruid", "Alexander",
        "Oosterflank", "Prinsenlaan", "Schenkel", "Capelsebrug", "Kralingse Zoom",
        "Voorschoterlaan", "Gerdesiaweg", "Oostplein", "Blaak", "Bleurs",
        "Eendrachtsplein", "Dijkzigt", "Coolhaven", "Delfshaven", "Marconiplein",
        "Schiedam Centrum",
    
        "Nesselande", "De Tochten", "Amlachtsland", "Nieuw Verlaat", "Hesseplaats",
    
        "De Terp", "Capelle Centrum", "Slotlaan", "Parkweg", "Troelstralaan",
        "Vijfsluizen", "Pernis", "Tussenwater", "Hoogvliet", "Zalmplaat",
        "Spijkenisse Centrum", "Heemraadlaan", "De Akkers",
    
        "Rotterdam Centraal", "Stadhuis", "Leuvehaven", "Wihelminaplein",
        "Rijnhaven", "Maashaven", "Zuidplein", "Slinge", "Rhoon", "Poortugaal",
    
        "Den Haag Centraal", "Laan van NOI", "Voorburg 't Loo", "Leidschendam-Voorburg",
        "Forepark", "Leidschenveen", "Nootdorp", "Pijkacker Centrum",
        "Pijnacker Zuid", "Berkel Westpolder", "Rodenrijs", "Meijersplein",
        "Melachthonweg", "Blijdorp"
    };
    
    // SELECCION DE TRAYECTO
    @FXML private ComboBox origen;
    @FXML private ComboBox meta;
    @FXML private Button buscar;
    
    // Nodos
    // - Linea A
    @FXML private Circle n1;
    @FXML private Circle n2;
    @FXML private Circle n3;
    @FXML private Circle n4;
    @FXML private Circle n5;
    @FXML private Circle n6;
    @FXML private Circle n7;
    @FXML private Circle n8;
    @FXML private Circle n9;
    @FXML private Circle n10;
    @FXML private Circle n11;
    @FXML private Circle n12;
    @FXML private Circle n13;
    @FXML private Circle n14;
    @FXML private Circle n15;
    @FXML private Circle n16;
    @FXML private Circle n17;
    @FXML private Circle n18;
    @FXML private Circle n19;
    @FXML private Circle n20;
    // - Linea B
    @FXML private Circle n21;
    @FXML private Circle n22;
    @FXML private Circle n23;
    @FXML private Circle n24;
    @FXML private Circle n25;
    // - Linea C
    @FXML private Circle n26;
    @FXML private Circle n27;
    @FXML private Circle n28;
    @FXML private Circle n29;
    @FXML private Circle n30;
    @FXML private Circle n31;
    @FXML private Circle n32;
    @FXML private Circle n33;
    @FXML private Circle n34;
    @FXML private Circle n35;
    @FXML private Circle n36;
    @FXML private Circle n37;
    @FXML private Circle n38;
    // - Linea D
    @FXML private Circle n39;
    @FXML private Circle n40;
    @FXML private Circle n41;
    @FXML private Circle n42;
    @FXML private Circle n43;
    @FXML private Circle n44;
    @FXML private Circle n45;
    @FXML private Circle n46;
    @FXML private Circle n47;
    @FXML private Circle n48;
    // - Linea E
    @FXML private Circle n49;
    @FXML private Circle n50;
    @FXML private Circle n51;
    @FXML private Circle n52;
    @FXML private Circle n53;
    @FXML private Circle n54;
    @FXML private Circle n55;
    @FXML private Circle n56;
    @FXML private Circle n57;
    @FXML private Circle n58;
    @FXML private Circle n59;
    @FXML private Circle n60;
    @FXML private Circle n61;
    @FXML private Circle n62;
    
    // ARISTAS
    // - Linea A
    @FXML private Line a1;
    @FXML private Line a2;
    @FXML private Line a3;
    @FXML private Line a4;
    @FXML private Line a5;
    @FXML private Line a6;
    @FXML private Line a7;
    @FXML private Line a8;
    @FXML private Line a9;
    @FXML private Line a10;
    @FXML private Line a11;
    @FXML private Line a12;
    @FXML private Line a13;
    @FXML private Line a14;
    @FXML private Line a15;
    @FXML private Line a16;
    @FXML private Line a17;
    @FXML private Line a18;
    @FXML private Line a19;
    // - Linea B
    @FXML private Line a20;
    @FXML private Line a21;
    @FXML private Line a22;
    @FXML private Line a23;
    @FXML private Line a24;
    @FXML private Line a25;
    @FXML private Line a26;
    @FXML private Line a27;
    @FXML private Line a28;
    @FXML private Line a29;
    @FXML private Line a30;
    @FXML private Line a31;
    @FXML private Line a32;
    @FXML private Line a33;
    @FXML private Line a34;
    @FXML private Line a35;
    @FXML private Line a36;
    @FXML private Line a37;
    @FXML private Line a38;
    @FXML private Line a39;
    @FXML private Line a40;
    @FXML private Line a41;
    // - Linea C
    @FXML private Line a42;
    @FXML private Line a43;
    @FXML private Line a44;
    @FXML private Line a45;
    @FXML private Line a46;
    @FXML private Line a47;
    @FXML private Line a48;
    @FXML private Line a49;
    @FXML private Line a50;
    @FXML private Line a51;
    @FXML private Line a52;
    @FXML private Line a53;
    @FXML private Line a54;
    @FXML private Line a55;
    @FXML private Line a56;
    @FXML private Line a57;
    @FXML private Line a58;
    @FXML private Line a59;
    @FXML private Line a60;
    @FXML private Line a61;
    @FXML private Line a62;
    @FXML private Line a63;
    @FXML private Line a64;
    @FXML private Line a65;
    @FXML private Line a66;
    // - Linea D
    @FXML private Line a67;
    @FXML private Line a68;
    @FXML private Line a69;
    @FXML private Line a70;
    @FXML private Line a71;
    @FXML private Line a72;
    @FXML private Line a73;
    @FXML private Line a74;
    @FXML private Line a75;
    @FXML private Line a76;
    @FXML private Line a77;
    @FXML private Line a78;
    @FXML private Line a79;
    @FXML private Line a80;
    @FXML private Line a81;
    @FXML private Line a82;
    // - Linea E
    @FXML private Line a83;
    @FXML private Line a84;
    @FXML private Line a85;
    @FXML private Line a86;
    @FXML private Line a87;
    @FXML private Line a88;
    @FXML private Line a89;
    @FXML private Line a90;
    @FXML private Line a91;
    @FXML private Line a92;
    @FXML private Line a93;
    @FXML private Line a94;
    @FXML private Line a95;
    @FXML private Line a96;
    @FXML private Line a97;
    @FXML private Line a98;
    @FXML private Line a99;
    @FXML private Line a100;
    @FXML private Line a101;
    @FXML private Line a102;
    @FXML private Line a103;
    @FXML private Line a104;
    
    // ELEMENTOS GRAFICOS
    private ArrayList<Circle> estaciones = new ArrayList<>();
    private ArrayList<Line> trayectos = new ArrayList<>();
    
    private ArrayList<Nodo> nodos = new ArrayList<>();
    private ArrayList<IArista> aristas = new ArrayList<>();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializaListas();
        inicializaEstaciones();
        inicializaTrayectos();
        inicializaNodosAristas();
    }
    
    private void inicializaListas(){
        origen.getItems().addAll(nombres);
        meta.getItems().addAll(nombres);
    }
    
    private void inicializaEstaciones(){
        estaciones.add(n1);
        estaciones.add(n2);
        estaciones.add(n3);
        estaciones.add(n4);
        estaciones.add(n5);
        estaciones.add(n6);
        estaciones.add(n7);
        estaciones.add(n8);
        estaciones.add(n9);
        estaciones.add(n10);
        estaciones.add(n11);
        estaciones.add(n12);
        estaciones.add(n13);
        estaciones.add(n14);
        estaciones.add(n15);
        estaciones.add(n16);
        estaciones.add(n17);
        estaciones.add(n18);
        estaciones.add(n19);
        estaciones.add(n20);
        estaciones.add(n21);
        estaciones.add(n22);
        estaciones.add(n23);
        estaciones.add(n24);
        estaciones.add(n25);
        estaciones.add(n26);
        estaciones.add(n27);
        estaciones.add(n28);
        estaciones.add(n29);
        estaciones.add(n30);
        estaciones.add(n31);
        estaciones.add(n32);
        estaciones.add(n33);
        estaciones.add(n34);
        estaciones.add(n35);
        estaciones.add(n36);
        estaciones.add(n37);
        estaciones.add(n38);
        estaciones.add(n39);
        estaciones.add(n40);
        estaciones.add(n41);
        estaciones.add(n42);
        estaciones.add(n43);
        estaciones.add(n44);
        estaciones.add(n45);
        estaciones.add(n46);
        estaciones.add(n47);
        estaciones.add(n48);
        estaciones.add(n49);
        estaciones.add(n50);
        estaciones.add(n51);
        estaciones.add(n52);
        estaciones.add(n53);
        estaciones.add(n54);
        estaciones.add(n55);
        estaciones.add(n56);
        estaciones.add(n57);
        estaciones.add(n58);
        estaciones.add(n59);
        estaciones.add(n60);
        estaciones.add(n61);
        estaciones.add(n62);
    }
    
    private void inicializaTrayectos(){
        trayectos.add(a1);
        trayectos.add(a2);
        trayectos.add(a3);
        trayectos.add(a4);
        trayectos.add(a5);
        trayectos.add(a6);
        trayectos.add(a7);
        trayectos.add(a8);
        trayectos.add(a9);
        trayectos.add(a10);
        trayectos.add(a11);
        trayectos.add(a12);
        trayectos.add(a13);
        trayectos.add(a14);
        trayectos.add(a15);
        trayectos.add(a16);
        trayectos.add(a17);
        trayectos.add(a18);
        trayectos.add(a19);
        trayectos.add(a20);
        trayectos.add(a21);
        trayectos.add(a22);
        trayectos.add(a23);
        trayectos.add(a24);
        trayectos.add(a25);
        trayectos.add(a26);
        trayectos.add(a27);
        trayectos.add(a28);
        trayectos.add(a29);
        trayectos.add(a30);
        trayectos.add(a31);
        trayectos.add(a32);
        trayectos.add(a33);
        trayectos.add(a34);
        trayectos.add(a35);
        trayectos.add(a36);
        trayectos.add(a37);
        trayectos.add(a38);
        trayectos.add(a39);
        trayectos.add(a40);
        trayectos.add(a41);
        trayectos.add(a42);
        trayectos.add(a43);
        trayectos.add(a44);
        trayectos.add(a45);
        trayectos.add(a46);
        trayectos.add(a47);
        trayectos.add(a48);
        trayectos.add(a49);
        trayectos.add(a50);
        trayectos.add(a51);
        trayectos.add(a52);
        trayectos.add(a53);
        trayectos.add(a54);
        trayectos.add(a55);
        trayectos.add(a56);
        trayectos.add(a57);
        trayectos.add(a58);
        trayectos.add(a59);
        trayectos.add(a60);
        trayectos.add(a61);
        trayectos.add(a62);
        trayectos.add(a63);
        trayectos.add(a64);
        trayectos.add(a65);
        trayectos.add(a66);
        trayectos.add(a67);
        trayectos.add(a68);
        trayectos.add(a69);
        trayectos.add(a70);
        trayectos.add(a71);
        trayectos.add(a72);
        trayectos.add(a73);
        trayectos.add(a74);
        trayectos.add(a75);
        trayectos.add(a76);
        trayectos.add(a77);
        trayectos.add(a78);
        trayectos.add(a79);
        trayectos.add(a80);
        trayectos.add(a81);
        trayectos.add(a82);
        trayectos.add(a83);
        trayectos.add(a84);
        trayectos.add(a85);
        trayectos.add(a86);
        trayectos.add(a87);
        trayectos.add(a88);
        trayectos.add(a89);
        trayectos.add(a90);
        trayectos.add(a91);
        trayectos.add(a92);
        trayectos.add(a93);
        trayectos.add(a94);
        trayectos.add(a95);
        trayectos.add(a96);
        trayectos.add(a97);
        trayectos.add(a98);
        trayectos.add(a99);
        trayectos.add(a100);
        trayectos.add(a101);
        trayectos.add(a102);
        trayectos.add(a103);
        trayectos.add(a104);
        
        for(Line l : trayectos){
            l.setOpacity(0.3);
        }
    }
    
    
    private void inicializaNodosAristas(){
        // CREAMOS NODOS:
        // LINEA A
        nodos.add(new Nodo(nombres[0],n1));                                     // Binnenhof            00
        nodos.add(new Nodo(nombres[1],n2));                                     // Romeynshof           01
        nodos.add(new Nodo(nombres[2],n3));                                     // Graskruid            02
        nodos.add(new Nodo(nombres[3],n4));                                     // Alexander            03
        nodos.add(new Nodo(nombres[4],n5));                                     // Oosterflank          04
        nodos.add(new Nodo(nombres[5],n6));                                     // Prinsenlaan          05
        nodos.add(new Nodo(nombres[6],n7));                                     // Schenkel             06
        nodos.add(new Nodo(nombres[7],n8));                                     // Capelsebrug          07
        nodos.add(new Nodo(nombres[8],n9));                                     // Kralingse Zoom       08
        nodos.add(new Nodo(nombres[9],n10));                                    // Voorschoterlaan      09
        nodos.add(new Nodo(nombres[10],n11));                                   // Gerdesiaweg          10
        nodos.add(new Nodo(nombres[11],n12));                                   // Oostplein            11
        nodos.add(new Nodo(nombres[12],n13));                                   // Blaak                12
        nodos.add(new Nodo(nombres[13],n14));                                   // Beurs                13
        nodos.add(new Nodo(nombres[14],n15));                                   // Eendrachtsplein      14
        nodos.add(new Nodo(nombres[15],n16));                                   // Dijkzigt             15
        nodos.add(new Nodo(nombres[16],n17));                                   // Coolhaven            16
        nodos.add(new Nodo(nombres[17],n18));                                   // Delfshaven           17
        nodos.add(new Nodo(nombres[18],n19));                                   // Marconiplein         18
        nodos.add(new Nodo(nombres[19],n20));                                   // Schiedam Centrum     19
        
        // LINEA B
        nodos.add(new Nodo(nombres[20],n21));                                   // Nesselande           20
        nodos.add(new Nodo(nombres[21],n22));                                   // De Tochten           21
        nodos.add(new Nodo(nombres[22],n23));                                   // Amlachtsland         22
        nodos.add(new Nodo(nombres[23],n24));                                   // Nieuw Verlaat        23
        nodos.add(new Nodo(nombres[24],n25));                                   // Hesseplaats          24
        nodos.add(new Nodo(nombres[2],n3));                                     // Graskruid            25
        nodos.add(new Nodo(nombres[3],n4));                                     // Alexander            26
        nodos.add(new Nodo(nombres[4],n5));                                     // Oosterflank          27
        nodos.add(new Nodo(nombres[5],n6));                                     // Prinsenlaan          28
        nodos.add(new Nodo(nombres[6],n7));                                     // Schenkel             29
        nodos.add(new Nodo(nombres[7],n8));                                     // Capelsebrug          30
        nodos.add(new Nodo(nombres[8],n9));                                     // Kralingse Zoom       31
        nodos.add(new Nodo(nombres[9],n10));                                    // Voorschoterlaan      32
        nodos.add(new Nodo(nombres[10],n11));                                   // Gerdesiaweg          33
        nodos.add(new Nodo(nombres[11],n12));                                   // Oostplein            34
        nodos.add(new Nodo(nombres[12],n13));                                   // Blaak                35
        nodos.add(new Nodo(nombres[13],n14));                                   // Beurs                36
        nodos.add(new Nodo(nombres[14],n15));                                   // Eendrachtsplein      37
        nodos.add(new Nodo(nombres[15],n16));                                   // Dijkzigt             38
        nodos.add(new Nodo(nombres[16],n17));                                   // Coolhaven            39
        nodos.add(new Nodo(nombres[17],n18));                                   // Delfshaven           40
        nodos.add(new Nodo(nombres[18],n19));                                   // Marconiplein         41
        nodos.add(new Nodo(nombres[19],n20));                                   // Schiedam Centrum     42
        
        // LINEA C
        nodos.add(new Nodo(nombres[25],n26));                                   // De Terp              43
        nodos.add(new Nodo(nombres[26],n27));                                   // Capelle Centrum      44
        nodos.add(new Nodo(nombres[27],n28));                                   // Slotlaan             45
        nodos.add(new Nodo(nombres[7],n8));                                     // Capelsebrug          46
        nodos.add(new Nodo(nombres[8],n9));                                     // Kralingse Zoom       47
        nodos.add(new Nodo(nombres[9],n10));                                    // Voorschoterlaan      48
        nodos.add(new Nodo(nombres[10],n11));                                   // Gerdesiaweg          49
        nodos.add(new Nodo(nombres[11],n12));                                   // Oostplein            50
        nodos.add(new Nodo(nombres[12],n13));                                   // Blaak                51
        nodos.add(new Nodo(nombres[13],n14));                                   // Beurs                52
        nodos.add(new Nodo(nombres[14],n15));                                   // Eendrachtsplein      53
        nodos.add(new Nodo(nombres[15],n16));                                   // Dijkzigt             54
        nodos.add(new Nodo(nombres[16],n17));                                   // Coolhaven            55
        nodos.add(new Nodo(nombres[17],n18));                                   // Delfshaven           56
        nodos.add(new Nodo(nombres[18],n19));                                   // Marconiplein         57
        nodos.add(new Nodo(nombres[19],n20));                                   // Schiedam Centrum     58
        nodos.add(new Nodo(nombres[28],n29));                                   // Parkweg              59
        nodos.add(new Nodo(nombres[29],n30));                                   // Troelstralaan        60
        nodos.add(new Nodo(nombres[30],n31));                                   // Vijfsluizen          61
        nodos.add(new Nodo(nombres[31],n32));                                   // Pernis               62
        nodos.add(new Nodo(nombres[32],n33));                                   // Tussenwater          63
        nodos.add(new Nodo(nombres[33],n34));                                   // Hoogvliet            64
        nodos.add(new Nodo(nombres[34],n35));                                   // Zalmplaat            65
        nodos.add(new Nodo(nombres[35],n36));                                   // Spijkenisse Centrum  66
        nodos.add(new Nodo(nombres[36],n37));                                   // Heemraadlaan         67
        nodos.add(new Nodo(nombres[37],n38));                                   // De Akkers            68
        
        // LINEA D
        nodos.add(new Nodo(nombres[38],n39));                                   // Rotterdam Centraal   69
        nodos.add(new Nodo(nombres[39],n40));                                   // Stadhuis             70
        nodos.add(new Nodo(nombres[13],n14));                                   // Beurs                71
        nodos.add(new Nodo(nombres[40],n41));                                   // Leuvehaven           72
        nodos.add(new Nodo(nombres[41],n42));                                   // Wilhelminaplein      73
        nodos.add(new Nodo(nombres[42],n43));                                   // Rijnhaven            74
        nodos.add(new Nodo(nombres[43],n44));                                   // Maashaven            75
        nodos.add(new Nodo(nombres[44],n45));                                   // Zuidplein            76
        nodos.add(new Nodo(nombres[45],n46));                                   // Slinge               77
        nodos.add(new Nodo(nombres[46],n47));                                   // Rhoon                78
        nodos.add(new Nodo(nombres[47],n48));                                   // Poortugaal           79
        nodos.add(new Nodo(nombres[32],n33));                                   // Tussenwater          80
        nodos.add(new Nodo(nombres[33],n34));                                   // Hoogvliet            81
        nodos.add(new Nodo(nombres[34],n35));                                   // Zalmplaat            82
        nodos.add(new Nodo(nombres[35],n36));                                   // Spijkenisse Centrum  83
        nodos.add(new Nodo(nombres[36],n37));                                   // Heemraadlaan         84
        nodos.add(new Nodo(nombres[37],n38));                                   // De Akkers            85
        
        // LINEA E
        nodos.add(new Nodo(nombres[48],n49));                                   // Den Haag Centraal    86
        nodos.add(new Nodo(nombres[49],n50));                                   // Laan van NOI         87
        nodos.add(new Nodo(nombres[50],n51));                                   // Voorburg 't Loo      88
        nodos.add(new Nodo(nombres[51],n52));                                   // Leidschendam-Voorburg89
        nodos.add(new Nodo(nombres[52],n53));                                   // Forepark             90
        nodos.add(new Nodo(nombres[53],n54));                                   // Leidschenveen        91
        nodos.add(new Nodo(nombres[54],n55));                                   // Nootdorp             92
        nodos.add(new Nodo(nombres[55],n56));                                   // Pijkacker Centrum    93
        nodos.add(new Nodo(nombres[56],n57));                                   // Pijnacker Zuid       94
        nodos.add(new Nodo(nombres[57],n58));                                   // Berkel Westpolder    95
        nodos.add(new Nodo(nombres[58],n59));                                   // Rodenrijs            96
        nodos.add(new Nodo(nombres[59],n60));                                   // Meijersplein         97
        nodos.add(new Nodo(nombres[60],n61));                                   // Melachthonweg        98
        nodos.add(new Nodo(nombres[61],n62));                                   // Blijdorp             99
        nodos.add(new Nodo(nombres[38],n39));                                   // Rotterdam Centraal  100
        nodos.add(new Nodo(nombres[39],n40));                                   // Stadhuis            101
        nodos.add(new Nodo(nombres[13],n14));                                   // Beurs               102
        nodos.add(new Nodo(nombres[40],n41));                                   // Leuvehaven          103
        nodos.add(new Nodo(nombres[41],n42));                                   // Wilhelminaplein     104
        nodos.add(new Nodo(nombres[42],n43));                                   // Rijnhaven           105
        nodos.add(new Nodo(nombres[43],n44));                                   // Maashaven           106
        nodos.add(new Nodo(nombres[44],n45));                                   // Zuidplein           107
        nodos.add(new Nodo(nombres[45],n46));                                   // Slinge              108
        
        // CREAMOS ARISTAS CONECTANDO LOS NODOS:
        // LINEA A - 19 Aristas (Lineas a1 hasta a19): Nodos 0 a 19
        for(int i = 0; i < 19; i++){
            aristas.add(new Arista(nodos.get(i), nodos.get(i+1), trayectos.get(i)));
        }
        // LINEA B - 22 Aristas (Lineas a20 hasta a41): Nodos 20 a 42
        for(int i = 0; i < 22; i++){
            aristas.add(new Arista(nodos.get(i+20), nodos.get(i+21), trayectos.get(i+19)));
        }
        // LINEA C - 25 Aristas (Lineas a42 hasta a66): Nodos 43 a 68
        for(int i = 0; i < 25; i++){
            aristas.add(new Arista(nodos.get(i+43), nodos.get(i+44), trayectos.get(i+41)));
        }
        // LINEA D - 16 Aristas (Lineas a67 hasta a82): Nodos 69 a 85
        for(int i = 0; i < 16; i++){
            aristas.add(new Arista(nodos.get(i+69), nodos.get(i+70), trayectos.get(i+66)));
        }
        // LINEA E - 22 Aristas (Lineas a83 hasta a104): Nodos 86 a 108
        for(int i = 0; i < 22; i++){
            aristas.add(new Arista(nodos.get(i+86), nodos.get(i+87), trayectos.get(i+82)));
        }
        
        // TRASBORDOS A TENER EN CUENTA:
        // Rotterdam Centraal (Lineas D y E): Nodos 69 y 100
        aristas.add(new Transbordo(nodos.get(69),nodos.get(100), 1));
        // Schiedam Centrum (Lineas A, B y C): Nodos 19, 42 y 58
        aristas.add(new Transbordo(nodos.get(19),nodos.get(42), 1));
        aristas.add(new Transbordo(nodos.get(19),nodos.get(58), 1));
        aristas.add(new Transbordo(nodos.get(42),nodos.get(58), 1));
        // Capelsebrug (Lineas A, B y C): Nodos 7, 30 y 46
        aristas.add(new Transbordo(nodos.get(7),nodos.get(30), 1));
        aristas.add(new Transbordo(nodos.get(7),nodos.get(46), 1));
        aristas.add(new Transbordo(nodos.get(30),nodos.get(46), 1));
        // Beurs (Lineas A, B, C, D y E): Nodos 13, 36, 52, 71 y 102
        aristas.add(new Transbordo(nodos.get(13),nodos.get(36), 1));
        aristas.add(new Transbordo(nodos.get(13),nodos.get(52), 1));
        aristas.add(new Transbordo(nodos.get(13),nodos.get(71), 1));
        aristas.add(new Transbordo(nodos.get(13),nodos.get(102), 1));
        aristas.add(new Transbordo(nodos.get(36),nodos.get(52), 1));
        aristas.add(new Transbordo(nodos.get(36),nodos.get(71), 1));
        aristas.add(new Transbordo(nodos.get(36),nodos.get(102), 1));
        aristas.add(new Transbordo(nodos.get(52),nodos.get(71), 1));
        aristas.add(new Transbordo(nodos.get(52),nodos.get(102), 1));
        aristas.add(new Transbordo(nodos.get(71),nodos.get(102), 1));
        
        // RESTO TRANSBORDOS
        // Stadhuis (Lineas D y E): Nodos 70 y 101
        aristas.add(new Transbordo(nodos.get(70),nodos.get(101), 0.5));
        // Leuvehaven (Lineas D y E): Nodos 72 y 103
        aristas.add(new Transbordo(nodos.get(72),nodos.get(103), 0.5));
        // Wilhelminaplein (Lineas D y E): Nodos 73 y 104
        aristas.add(new Transbordo(nodos.get(73),nodos.get(104), 0.5));
        // Rijnhaven (Lineas D y E): Nodos 74 y 105
        aristas.add(new Transbordo(nodos.get(74),nodos.get(105), 0.5));
        // Maashaven (Lineas D y E): Nodos 75 y 106
        aristas.add(new Transbordo(nodos.get(75),nodos.get(106), 0.5));
        // Zuidplein (Lineas D y E): Nodos 76 y 107
        aristas.add(new Transbordo(nodos.get(76),nodos.get(107), 0.5));
        // Slinge (Lineas D y E): Nodos 77 y 108
        aristas.add(new Transbordo(nodos.get(77),nodos.get(108), 0.5));
        
        // Tussenwater (Lineas C y D): Nodos 63 y 80
        aristas.add(new Transbordo(nodos.get(63),nodos.get(80), 0.5));
        // Hoogvliet (Lineas C y D): Nodos 64 y 81
        aristas.add(new Transbordo(nodos.get(64),nodos.get(81), 0.5));
        // Zalmplaat (Lineas C y D): Nodos 65 y 82
        aristas.add(new Transbordo(nodos.get(65),nodos.get(82), 0.5));
        // Spijkenisse Centrum (Lineas C y D): Nodos 66 y 83
        aristas.add(new Transbordo(nodos.get(66),nodos.get(83), 0.5));
        // Heemraadlaan (Lineas C y D): Nodos 67 y 84
        aristas.add(new Transbordo(nodos.get(67),nodos.get(84), 0.5));
        // De Akkers (Lineas C y D): Nodos 68 y 85
        aristas.add(new Transbordo(nodos.get(68),nodos.get(85), 0.5));
        
        // Graskruid (Lineas A y B): Nodos 02 y 25
        aristas.add(new Transbordo(nodos.get(2),nodos.get(25), 0.5));
        // Alexander (Lineas A y B): Nodos 03 y 26
        aristas.add(new Transbordo(nodos.get(3),nodos.get(26), 0.5));
        // Oosterflank (Lineas A y B): Nodos 04 y 27
        aristas.add(new Transbordo(nodos.get(4),nodos.get(27), 0.5));
        // Prinsenlaan (Lineas A y B): Nodos 05 y 28
        aristas.add(new Transbordo(nodos.get(5),nodos.get(28), 0.5));
        // Schenkel (Lineas A y B): Nodos 06 y 29
        aristas.add(new Transbordo(nodos.get(6),nodos.get(29), 0.5));
        
        // Endrachtsplein (Lineas A, B y C): Nodos 14, 37 y 53
        aristas.add(new Transbordo(nodos.get(14),nodos.get(37), 0.7));
        aristas.add(new Transbordo(nodos.get(14),nodos.get(53), 0.7));
        aristas.add(new Transbordo(nodos.get(37),nodos.get(53), 0.7));
        // Dijkzigt (Lineas A, B y C): Nodos 15, 38 y 54
        aristas.add(new Transbordo(nodos.get(15),nodos.get(38), 0.7));
        aristas.add(new Transbordo(nodos.get(15),nodos.get(54), 0.7));
        aristas.add(new Transbordo(nodos.get(38),nodos.get(54), 0.7));
        // Coolhaven (Lineas A, B y C): Nodos 16, 39 y 55
        aristas.add(new Transbordo(nodos.get(16),nodos.get(39), 0.7));
        aristas.add(new Transbordo(nodos.get(16),nodos.get(55), 0.7));
        aristas.add(new Transbordo(nodos.get(39),nodos.get(55), 0.7));
        // Delfshaven (Lineas A, B y C): Nodos 17, 40 y 56
        aristas.add(new Transbordo(nodos.get(17),nodos.get(40), 0.7));
        aristas.add(new Transbordo(nodos.get(17),nodos.get(56), 0.7));
        aristas.add(new Transbordo(nodos.get(40),nodos.get(56), 0.7));
        // Marconiplein (Lineas A, B y C): Nodos 18, 41 y 57
        aristas.add(new Transbordo(nodos.get(18),nodos.get(41), 0.7));
        aristas.add(new Transbordo(nodos.get(18),nodos.get(57), 0.7));
        aristas.add(new Transbordo(nodos.get(41),nodos.get(57), 0.7));
        
        
        // Kralingse Zoom (Lineas A, B y C): Nodos 08, 31 y 47
        aristas.add(new Transbordo(nodos.get(8),nodos.get(31), 0.7));
        aristas.add(new Transbordo(nodos.get(8),nodos.get(47), 0.7));
        aristas.add(new Transbordo(nodos.get(31),nodos.get(47), 0.7));
        // Voorschoterlaan (Lineas A, B y C): Nodos 09, 32 y 48
        aristas.add(new Transbordo(nodos.get(9),nodos.get(32), 0.7));
        aristas.add(new Transbordo(nodos.get(9),nodos.get(48), 0.7));
        aristas.add(new Transbordo(nodos.get(32),nodos.get(48), 0.7));
        // Gerdesiaweg (Lineas A, B y C): Nodos 10, 33 y 49
        aristas.add(new Transbordo(nodos.get(10),nodos.get(33), 0.7));
        aristas.add(new Transbordo(nodos.get(10),nodos.get(49), 0.7));
        aristas.add(new Transbordo(nodos.get(33),nodos.get(49), 0.7));
        // Oostplein (Lineas A, B y C): Nodos 11, 34 y 50
        aristas.add(new Transbordo(nodos.get(11),nodos.get(34), 0.7));
        aristas.add(new Transbordo(nodos.get(11),nodos.get(50), 0.7));
        aristas.add(new Transbordo(nodos.get(34),nodos.get(50), 0.7));
        // Blaak (Lineas A, B y C): Nodos 12, 35 y 51
        aristas.add(new Transbordo(nodos.get(12),nodos.get(35), 0.7));
        aristas.add(new Transbordo(nodos.get(12),nodos.get(51), 0.7));
        aristas.add(new Transbordo(nodos.get(35),nodos.get(51), 0.7));
        
        
        
        // INDICAMOS A CADA NODO SUS ADYACENTES
        for(IArista a : aristas){
            Nodo n = a.getOrigen();
            n.addAdyacente(a);
            n = a.getDestino();
            n.addAdyacente(a);
        }
    }
    
    @FXML
    private void calcularTrayecto(){
        /* Reset de trayecto */
        for(Circle c : estaciones)
            c.setFill(Paint.valueOf("#ffffff"));
        for(Line l : trayectos)
            l.setOpacity(0.3);
        
        /* Comprobamos que se ha seleccionado origen y meta y obtenemos todos los nodos de cada estacion */
        if(!(origen.getValue()==null) && !(meta.getValue()==null)){
            ArrayList<Nodo> nodosOrigen = new ArrayList<>();
            ArrayList<Nodo> nodosDestino = new ArrayList<>();
            for(Nodo n : nodos){
                if(n.getNombre().equals(origen.getValue()))
                    nodosOrigen.add(n);
                if(n.getNombre().equals(meta.getValue()))
                    nodosDestino.add(n);
            }
            
            /* Ejecutamos el algoritmo para todas las combinaciones de nodos */
            Nodo n1 = null;
            Nodo n2 = null;
            double gActual = 0.0;
            for(int i = 0; i < nodosOrigen.size(); i++){
                for(int j = 0; j < nodosDestino.size(); j++){
                    reset();
                    AlgoritmoAEstrella algoritmo = new AlgoritmoAEstrella(nodosOrigen.get(i), nodosDestino.get(j));
                    algoritmo.ejecutar();
                    if(n1 == null && n2 == null) {  // Primera iteracion
                        n1 = nodosOrigen.get(i);
                        n2 = nodosDestino.get(j);
                        gActual = n2.getG();
                    } else {                        // Ya se ha calculado una ruta
                        if(nodosDestino.get(j).getG() < gActual){   // Si la nueva ruta es mas corta se sobreescribe la ruta guardada
                            n1 = nodosOrigen.get(i);
                            n2 = nodosDestino.get(j);
                            gActual = n2.getG();
                        }
                    }
                }
            }
            reset();
            AlgoritmoAEstrella algoritmo = new AlgoritmoAEstrella(n1, n2);
            algoritmo.ejecutar();
            // Una vez salimos de las iteraciones, tenemos guardada la mejor ruta
            
            /* Pintamos recorrido */
            boolean terminar = false;
            while(!terminar){
                n2.getPunto().setFill(Paint.valueOf("#000000"));  // PINTA PUNTO
                if(n2.getAntecesor().equals(n2)){                 // FINAL 
                    terminar = true;                              // SALIR
                    continue;
                }
                
                /* Seguir buscando */
                for(IArista a : n2.getAdyacentes()){
                    if(a.getOrigen().equals(n2.getAntecesor()) || a.getDestino().equals(n2.getAntecesor())){
                        if(a instanceof Arista)
                            a.getLinea().setOpacity(1);           // PINTA LINEA
                        n2 = n2.getAntecesor();                   // SIG. PUNTO
                    }
                }
            }
        }
        
        /* Reset de nodos para nuevo trayecto */
        reset();
    }
    
    public void reset(){
        for(Nodo n : nodos)
            n.setAntecesor(n);
    }
    
    
}
