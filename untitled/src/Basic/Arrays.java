package Basic;

public class Arrays {
    public static void main(str[] args) {
        int [] numbers={2,4,6,8};

        str[] names={"Yohana","Nipun","Minoli"};
        names[2]= "Suranimala";

        System.out.println("Names : " + names[2]);

        str[] nikama=new str[10];

        nikama[0]="Nipun";
        nikama[1]="Suranimala";
        nikama[2]="Nipun";
        nikama[3]="Nipun";
        nikama[4]="Nipun";
        nikama[5]="Nipun";

        for (int i=0;i<nikama.length;i++) {
            System.out.println(nikama[i]);
        }

        int [][] x={{1,2,3},{4,5,6},{7,8,9}};

        for(int j=0;j<x.length;j++){
            for(int i=0;i<x[j].length;i++){
                System.out.println(x[j][i]);
            }
        }
    }
}
