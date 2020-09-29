package gfg;

public class Series_ap {
	int nthTermOfAP(int A1, int A2, int N) {
        
        int a=A1,t=0,t2=A2-A1;
        for(int n=1;n<=N;n++){
            t=a+(n-1)*t2;
        }
       
        return t;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
