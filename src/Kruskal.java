public class Kruskal {

    public int[] fathers;


    public Kruskal(int fathers) {
        this.fathers =  new int[fathers];
    }

    //  Disjoint Sets Data Structure



    int find(int x){
        if(fathers[x] == x){
           // System.out.println(fathers[x] + " = " +  x);
            return x;

        }
        return find(fathers[x]);
    }

    void unite(int x, int y){
        int fx = find(x);
        int fy = find(y);
        fathers[fx] = fy;
    }

}
