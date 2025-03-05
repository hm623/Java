import tools.Colors;
import tools.Controls;
import tools.*;


class item{

    public char vertext;
    public int shortestdistance;
    public char fromvertex;
    public boolean marked;

};

public class Graph {

    int[] visited = { 0, 0, 0, 0, 0};

    item[] table = new item[5];

    void DisplayDFS(int[][] adj, int nodeNumber){

        System.out.print(nodeNumber);
        visited[nodeNumber] = 1;
        for (int i=0; i < 5; i++){

            if ((adj[nodeNumber][i] != 0) && (visited[i] == 0)){
                DisplayDFS(adj,i);
            }
        }

    }


    void DisplayShortest(int[][] adj, int nodeNumber){

    }

    void PrintInfo(int[][] adj){

        DisplayDFS(adj,0);


    }

    void DrawA(){

        Controls.Box(35,20,07,07,91,Colors.BLUE,Colors.GREEN_BACKGROUND);
        Controls.printxy(38,23,"A");
        Controls.printxy(38,20,Symbols.EXTENDED[49]);
        
        Controls.printxy(37,21,Symbols.EXTENDED[49]);
        Controls.printxy(39,21,Symbols.EXTENDED[49]);

        Controls.printxy(36,22,Symbols.EXTENDED[49]);
        Controls.printxy(40,22,Symbols.EXTENDED[49]);

        Controls.printxy(35,23,Symbols.EXTENDED[49]);
        Controls.printxy(41,23,Symbols.EXTENDED[49]);

        Controls.printxy(36,23,Symbols.EXTENDED[49]);
        Controls.printxy(40,23,Symbols.EXTENDED[49]);

        Controls.printxy(37,23,Symbols.EXTENDED[49]);
        Controls.printxy(39,23,Symbols.EXTENDED[49]);

        Controls.printxy(35,24,Symbols.EXTENDED[49]);
        Controls.printxy(41,24,Symbols.EXTENDED[49]);

        Controls.printxy(35,25,Symbols.EXTENDED[49]);
        Controls.printxy(41,25,Symbols.EXTENDED[49]);

        Controls.printxy(35,26,Symbols.EXTENDED[49]);
        Controls.printxy(41,26,Symbols.EXTENDED[49]);
    
    }

    void DrawB(){

        Controls.Box(20,10,07,07,91,Colors.BLUE,Colors.GREEN_BACKGROUND);
        Controls.printxy(23,13,"B");
        Controls.printxy(20,10,Symbols.EXTENDED[49]);
        Controls.printxy(20,11,Symbols.EXTENDED[49]);
        Controls.printxy(20,12,Symbols.EXTENDED[49]);
        Controls.printxy(20,13,Symbols.EXTENDED[49]);
        Controls.printxy(20,14,Symbols.EXTENDED[49]);
        Controls.printxy(20,15,Symbols.EXTENDED[49]);
        Controls.printxy(20,16,Symbols.EXTENDED[49]);
       
        Controls.printxy(26,10,Symbols.EXTENDED[49]);
        Controls.printxy(26,11,Symbols.EXTENDED[49]);
        Controls.printxy(25,12,Symbols.EXTENDED[49]);
        Controls.printxy(24,13,Symbols.EXTENDED[49]);
        Controls.printxy(25,14,Symbols.EXTENDED[49]);
        Controls.printxy(26,15,Symbols.EXTENDED[49]);
        Controls.printxy(26,16,Symbols.EXTENDED[49]);

        Controls.printxy(21,10,Symbols.EXTENDED[49]);
        Controls.printxy(22,10,Symbols.EXTENDED[49]);
        Controls.printxy(23,10,Symbols.EXTENDED[49]);
        Controls.printxy(24,10,Symbols.EXTENDED[49]);
        Controls.printxy(25,10,Symbols.EXTENDED[49]);

        Controls.printxy(21,16,Symbols.EXTENDED[49]);
        Controls.printxy(22,16,Symbols.EXTENDED[49]);
        Controls.printxy(23,16,Symbols.EXTENDED[49]);
        Controls.printxy(24,16,Symbols.EXTENDED[49]);
        Controls.printxy(25,16,Symbols.EXTENDED[49]);

        Controls.printxy(21,13,Symbols.EXTENDED[49]);
        Controls.printxy(22,13,Symbols.EXTENDED[49]);


       


    
    }

    void DrawC(){

        Controls.Box(50,10,07,07,91,Colors.BLUE,Colors.GREEN_BACKGROUND);
        Controls.printxy(53,13,"C");

        Controls.printxy(50,10,Symbols.EXTENDED[49]);
        Controls.printxy(50,11,Symbols.EXTENDED[49]);
        Controls.printxy(50,12,Symbols.EXTENDED[49]);
        Controls.printxy(50,13,Symbols.EXTENDED[49]);
        Controls.printxy(50,14,Symbols.EXTENDED[49]);
        Controls.printxy(50,15,Symbols.EXTENDED[49]);
        Controls.printxy(50,16,Symbols.EXTENDED[49]);

        Controls.printxy(51,10,Symbols.EXTENDED[49]);
        Controls.printxy(52,10,Symbols.EXTENDED[49]);
        Controls.printxy(53,10,Symbols.EXTENDED[49]);
        Controls.printxy(54,10,Symbols.EXTENDED[49]);
        Controls.printxy(55,10,Symbols.EXTENDED[49]);
        Controls.printxy(56,10,Symbols.EXTENDED[49]);

        Controls.printxy(51,16,Symbols.EXTENDED[49]);
        Controls.printxy(52,16,Symbols.EXTENDED[49]);
        Controls.printxy(53,16,Symbols.EXTENDED[49]);
        Controls.printxy(54,16,Symbols.EXTENDED[49]);
        Controls.printxy(55,16,Symbols.EXTENDED[49]);
        Controls.printxy(56,16,Symbols.EXTENDED[49]);

        Controls.printxy(56,11,Symbols.EXTENDED[49]);
        Controls.printxy(56,15,Symbols.EXTENDED[49]);


        
       
        



    
    }

    void DrawD(){

        Controls.Box(15,30,07,07,91,Colors.BLUE,Colors.GREEN_BACKGROUND);
        Controls.printxy(18,33,"D");

        Controls.printxy(15,30,Symbols.EXTENDED[49]);
        Controls.printxy(15,31,Symbols.EXTENDED[49]);
        Controls.printxy(15,32,Symbols.EXTENDED[49]);
        Controls.printxy(15,33,Symbols.EXTENDED[49]);
        Controls.printxy(15,34,Symbols.EXTENDED[49]);
        Controls.printxy(15,35,Symbols.EXTENDED[49]);
        Controls.printxy(15,36,Symbols.EXTENDED[49]);

        Controls.printxy(16,30,Symbols.EXTENDED[49]);
        Controls.printxy(17,30,Symbols.EXTENDED[49]);
        Controls.printxy(18,30,Symbols.EXTENDED[49]);
        Controls.printxy(19,30,Symbols.EXTENDED[49]);
        Controls.printxy(20,30,Symbols.EXTENDED[49]);

        Controls.printxy(16,36,Symbols.EXTENDED[49]);
        Controls.printxy(17,36,Symbols.EXTENDED[49]);
        Controls.printxy(18,36,Symbols.EXTENDED[49]);
        Controls.printxy(19,36,Symbols.EXTENDED[49]);
        Controls.printxy(20,36,Symbols.EXTENDED[49]);

        Controls.printxy(21,31,Symbols.EXTENDED[49]);
        Controls.printxy(21,32,Symbols.EXTENDED[49]);
        Controls.printxy(21,33,Symbols.EXTENDED[49]);
        Controls.printxy(21,34,Symbols.EXTENDED[49]);
        Controls.printxy(21,35,Symbols.EXTENDED[49]);
        

    
    }

    void DrawE(){

        Controls.Box(55,30,07,07,91,Colors.BLUE,Colors.GREEN_BACKGROUND);
        Controls.printxy(58,33,"E");

        Controls.printxy(55,30,Symbols.EXTENDED[49]);
        Controls.printxy(55,31,Symbols.EXTENDED[49]);
        Controls.printxy(55,32,Symbols.EXTENDED[49]);
        Controls.printxy(55,33,Symbols.EXTENDED[49]);
        Controls.printxy(55,34,Symbols.EXTENDED[49]);
        Controls.printxy(55,35,Symbols.EXTENDED[49]);
        Controls.printxy(55,36,Symbols.EXTENDED[49]);

        
        Controls.printxy(56,30,Symbols.EXTENDED[49]);
        Controls.printxy(57,30,Symbols.EXTENDED[49]);
        Controls.printxy(58,30,Symbols.EXTENDED[49]);
        Controls.printxy(59,30,Symbols.EXTENDED[49]);
        Controls.printxy(60,30,Symbols.EXTENDED[49]);
        Controls.printxy(61,30,Symbols.EXTENDED[49]);

        Controls.printxy(56,33,Symbols.EXTENDED[49]);
        Controls.printxy(57,33,Symbols.EXTENDED[49]);
        Controls.printxy(59,33,Symbols.EXTENDED[49]);
        Controls.printxy(60,33,Symbols.EXTENDED[49]);
        Controls.printxy(61,33,Symbols.EXTENDED[49]);

        Controls.printxy(56,36,Symbols.EXTENDED[49]);
        Controls.printxy(57,36,Symbols.EXTENDED[49]);
        Controls.printxy(58,36,Symbols.EXTENDED[49]);
        Controls.printxy(59,36,Symbols.EXTENDED[49]);
        Controls.printxy(60,36,Symbols.EXTENDED[49]);
        Controls.printxy(61,36,Symbols.EXTENDED[49]);
        
        
    
    }


    void Connect_A_B(){


        

        for (int i = 34; i > 23; i--){

            Controls.printxy(i,23,"-");

        }

        for (int i = 23; i > 16; i--){

            if (i == 23){
                Controls.printxy(23,i,Symbols.EXTENDED[64]);
            }

           
            else{
                Controls.printxy(23,i,"|");
         }
        }
        Controls.Box(24,19,03,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(25,20,"6");

    }

    void Connect_B_C(){

        for (int i = 27; i < 50; i++ ){
            Controls.printxy(i,13,"-");
        }

        Controls.Box(37,14,03,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(38,15,"5");
        

    }

    void Connect_C_D(){

        Controls.printxy(53,9,"^");
        Controls.printxy(53,8,"^");

        for (int i = 53; i > 16; i--){

            if (i == 53){
                Controls.printxy(i,8,Symbols.EXTENDED[63]);
            }
            else if (i == 17){
                Controls.printxy(i,8,Symbols.EXTENDED[90]);
            }
            else
            {
                Controls.printxy(i,8,"<");
            }
        }

        for (int i = 9; i < 30; i++){

            Controls.printxy(17,i,"v");

        }

        Controls.Box(37,9,03,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(38,10,"3");

    }

    void Connect_B_D(){

        for (int i = 17; i < 30; i++){
            Controls.printxy(21,i,"|");
        }


        Controls.Box(18,19,03,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(19,20,"2");
    }

    void Connect_D_E(){

        for (int i = 22; i < 55; i++){
            Controls.printxy(i,33,"-");
        }

        Controls.Box(37,34,03,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(38,35,"1");
    }

    void Connect_E_A(){

        for (int i = 29; i > 23; i--){
            Controls.printxy(58,i,"^");
        }

        for (int i = 58; i > 41; i--){

            if (i == 58){
                Controls.printxy(i,23,Symbols.EXTENDED[63]);
            }

            else{
                Controls.printxy(i,23,"<");
            }
        }

        Controls.Box(53,24,04,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(54,25,"10");
    }

    void Connect_E_C(){

        for (int i = 29; i > 13; i--){
            Controls.printxy(61,i,"^");
        }

        for (int i = 61; i > 56; i--){
            
            if (i == 61)
            {
                Controls.printxy(i,13,Symbols.EXTENDED[63]);
            }

            else{
                Controls.printxy(i,13,"<");
            }
        }

        Controls.Box(58,19,03,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(59,20,"3");
    }

    void Connect_A_D(){
        
        for (int i = 27; i < 32; i++){

            if (i == 31){
                Controls.printxy(38,i,Symbols.EXTENDED[89]);
            }

           
            else{
                Controls.printxy(38,i,"|");
         }
        }

        for (int i = 37; i > 21; i--){

            Controls.printxy(i,31,"-");

        }

        Controls.Box(28,28,03,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(29,29,"1");

    }

    void Connect_B_E(){


        Controls.printxy(23,9,"|");
        Controls.printxy(23,8,Symbols.EXTENDED[90]);

        for (int i = 24; i < 58; i++){
            
            Controls.printxy(i,8,"-");
        }

        Controls.printxy(58,8,Symbols.EXTENDED[63]);

        for (int i = 9; i < 30; i++){
            Controls.printxy(58,i,"|");
        }

        Controls.Box(55,20,03,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(56,21,"2");


    }

    void Connect_C_E(){
        
        for (int i = 17; i < 31; i++){
            
            Controls.printxy(53,i,"|");
        }

        Controls.printxy(53,31,Symbols.EXTENDED[64]);
        Controls.printxy(54,31,"-");

        Controls.Box(50,20,03,03,91,Colors.RED,Colors.GREEN_BACKGROUND);
        Controls.printxy(51,21,"5");
    }


    

    private char getChar(int num){

        char letter = ' ';

        if (num == 0){

            letter = 'A';

        }

        else if (num == 1){

            letter = 'B';

        }

        else if (num == 2){

            letter = 'C';

        }

        else if (num == 3){

            letter = 'D';

        }

        else{

            letter = 'E';

        }

        return letter;
    }

    private void CSP(int[][] adjMatrix, int nodeName){

       
        for (int i = 0; i < 5; i++){

            if ((adjMatrix[nodeName][i] != 0) && (!table[i].marked)){

                if (table[nodeName].shortestdistance + adjMatrix[nodeName][i] < table[i].shortestdistance){

                    
                    table[i].shortestdistance = table[nodeName].shortestdistance + adjMatrix[nodeName][i];
                    table[i].fromvertex = getChar(nodeName);



                }

            }
        }

        table[nodeName].marked = true;

        int smallest = 1000;
        int smallestIndex = 0;
        for (int i = 0; i < 5; i++){

            if (!table[i].marked){

                if (table[i].shortestdistance < smallest){
                    
                    smallest =  table[i].shortestdistance;
                    smallestIndex = i;
                }

            }
        }

        if (smallestIndex != 0){

            CSP(adjMatrix,smallestIndex);
        }

    }

    


    

    void Run(int[][] adj){

        DrawA();
        DrawB();
        DrawC();
        DrawD();
        DrawE();

        Connect_A_B();
        Connect_B_C();
        Connect_D_E();
        Connect_B_D();

        Connect_A_D();
        Connect_B_E();
        Connect_C_E();

        table[0] = new item();
        table[0].vertext = 'A';
        table[0].shortestdistance = 0;
        table[0].fromvertex = ' ';
        table[0].marked = false;

        table[1] = new item();
        table[1].vertext = 'B';
        table[1].shortestdistance = 100;
        table[1].fromvertex = ' ';
        table[1].marked = false;

        table[2] = new item();
        table[2].vertext = 'C';
        table[2].shortestdistance = 100;
        table[2].fromvertex = ' ';
        table[2].marked = false;
   
        table[3] = new item();
        table[3].vertext = 'D';
        table[3].shortestdistance = 100;
        table[3].fromvertex = ' ';
        table[3].marked = false;

        table[4] = new item();
        table[4].vertext = 'E';
        table[4].shortestdistance = 100;
        table[4].fromvertex = ' ';
        table[4].marked = false;


        CSP(adj,0);


        System.out.println();
        System.out.println();
        System.out.println();

        for (int i=0; i < 5; i++){

    
            System.out.println(table[i].vertext + " " + table[i].shortestdistance + " " + table[i].fromvertex);


        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           
        }

        //First Iteration

        Controls.SetForegroundBackgroundColor(Colors.BLACK_BACKGROUND, Colors.BLACK);
        Controls.cls();
       
        DrawA();
        

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        Controls.printxy(10,3,"A to A shortest distance is 0");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }



        Controls.printxy(10,4,"B and D connects to A");

        DrawB();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        DrawD();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

       
        Connect_A_B();
        Connect_A_D();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           
        }




        //Second Iteration
        Controls.SetForegroundBackgroundColor(Colors.BLACK_BACKGROUND, Colors.BLACK);
        Controls.cls();

        Controls.printxy(10,3,"A is marked off");
        Controls.printxy(10,4,"D had the lowest value");
        
        


        DrawD();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        Controls.printxy(10,5,"D connects to B and E");
        Controls.printxy(10,6,"Updated distance from A to B is 3");
        Controls.printxy(10,7,"Current distance from A to E is 2");


        DrawB();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        DrawE();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        Connect_D_E();
        Connect_B_D();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
           
        }


        Controls.SetForegroundBackgroundColor(Colors.BLACK_BACKGROUND, Colors.BLACK);
        Controls.cls();

        Controls.printxy(10,3,"D is marked off");
        Controls.printxy(10,4,"E had the lowest value");

        DrawE();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }


        DrawB();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        DrawC();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }


        Controls.printxy(10,5,"E connects to B and C");
        Controls.printxy(10,6,"Shortest distance to B is kept: 3 ");
        Controls.printxy(10,7,"Current distance from A to C is 7");

        Connect_B_E();
        Connect_C_E();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
           
        }

        //third iteration
        Controls.SetForegroundBackgroundColor(Colors.BLACK_BACKGROUND, Colors.BLACK);
        Controls.cls();

        Controls.printxy(10,3,"E is marked off");
        Controls.printxy(10,4,"B had the lowest value");

        DrawB();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        Controls.printxy(10,5,"C is the only unvisited neighbor for B");

        DrawC();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        Connect_B_C();

        Controls.printxy(10,6,"Shortest distance to C is kept: 7");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
           
        }

        //fourth iteration
        Controls.SetForegroundBackgroundColor(Colors.BLACK_BACKGROUND, Colors.BLACK);
        Controls.cls();


        Controls.printxy(10,3,"B is marked off");
        Controls.printxy(10,4,"Move to the last vertex");
        Controls.printxy(10,5,"C has no unvisited neighbor");

        DrawC();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           
        }



        Controls.SetForegroundBackgroundColor(Colors.BLACK_BACKGROUND, Colors.BLACK);
        Controls.cls();


        Controls.printxy(10,6,"C is marked off");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           
        }

        Controls.SetForegroundBackgroundColor(Colors.BLACK_BACKGROUND, Colors.BLACK);
        Controls.cls();

        Controls.printxy(10,3,"The shortest path to get to all vertices");

        DrawA();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        Connect_A_D();

        DrawD();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        Connect_D_E();

        DrawE();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        Connect_B_E();
        DrawB();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
           
        }

        Connect_B_C();

        DrawC();


        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
           
        }



        Controls.SetForegroundBackgroundColor(Colors.BLACK_BACKGROUND, Colors.BLACK);
        Controls.cls();


        DrawA();
        DrawB();
        DrawC();
        DrawD();
        DrawE();

        Connect_A_B();
        Connect_B_C();
        Connect_D_E();
        Connect_B_D();

        Connect_A_D();
        Connect_B_E();
        Connect_C_E();

        Controls.printxy(10,5,"Overview");
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i=0; i < 5; i++){

    
            System.out.println(table[i].vertext + " " + table[i].shortestdistance + " " + table[i].fromvertex);


        }

    }

}
