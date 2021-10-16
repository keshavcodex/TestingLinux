package practices;

public class Pattern_for_Loop {
    //Pattern 1
    public static void pattern1(int n){
        int nst=1;
        for(int id=1; id<=n ; id++){
            for(int cst=1; cst<=nst; cst++){
                System.out.print("*");
            }
            System.out.println();
        nst++;
        }
    }
    //Pattern 1w
    public static void pattern1w(int n){
        int nst=1, id=1;
        while(id <= n){
            int cst=1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nst++;
            id++;
        }
    }
    //pattern2
    public static void pattern2(int n){
        int nst=1;
        for(int id = 1; id <= n; id++){
            for(int cst=1; cst<=nst; cst++) {
                System.out.print(cst);
            }
            System.out.println();

            nst++;
        }
    }
    //Pattern2w
    public static void pattern2w(int n){
        int nst=1, id=1;
        while(id <= n){
            int cst =1;
            while(cst<= nst){
                System.out.print(cst);
                cst++;
            }
            System.out.println();
            nst++;
            id++;
        }
    }
    //pattern3
    public static void pattern3(int n){
        int nst=1, nsp=n-1;
        for(int id = 1; id <= n; id++){
            for(int csp=1; csp<=nsp; csp++){
                System.out.print(" ");
            }
            for(int cst=1; cst<= nst; cst++){
                System.out.print("*");
            }
            System.out.println();
            nsp--;
            nst++;
        }
    }
    //Pattern3w
    public static void pattern3w(int n){
        int id=1, nst=1 , nsp= n-1;
        while(id<= n){
            int csp=1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nsp--;
            nst++;
            id++;
        }
    }
    //Pattern4 is here
    public static void pattern4(int n){
        int nst=1, nsp=n-1;
        for(int id=1; id<= n; id++){
            for(int csp = 1; csp <= nsp ; csp++){
                System.out.print(" ");
            }
            for(int cst= 1; cst<=nst; cst++){
                System.out.print("*");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
    //Pattern 4w is here
    public static void pattern4w(int n){
        int id=1, nst= 1, nsp= n-1;
        while(id <= n){
            int csp=1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nsp--;
            nst+=2;
            id++;
        }
    }
    //Pattern 5 is here 
    public static void pattern5(int n){
        int nst=1, nsp = n-1;
        for(int id=1; id<= 2*n-1 ; id++){
            for(int csp=1; csp<= nsp; csp++){
                System.out.print(" ");
            }
            for(int cst=1; cst <= nst; cst++){
                System.out.print("*");
            }
            System.out.println();
            if(id < n ){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }
        }
    }
    //Pattern 5w is here
    public static void pattern5w(int n){
        int id = 1, nst = 1, nsp = n - 1;
        while (id <= 2 * n - 1) {
            int csp=1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            id++;
        if(id < n){
            nsp--;
            nst+=2;
        }else{
            nsp++;
            nst-=2;
        }
        System.out.println();
        }
    }
    public static void main(String[] args){
        int n=5;
//        pattern1(n);
//        pattern1w(n);
//        pattern2(n);
//        pattern2w(n);
//        pattern3(n);
//        pattern3w(n);
//        pattern4(n);
//        pattern4w(n);
//        pattern5(5);
        pattern5w(n);
    }
}
