import java.math.BigInteger; 
import java.util.ArrayList;

public static void main (String[] args) {

    BigInteger N,phiN,e,d,m,c;

    // chipertext c, plaintext m

    N = new BigInteger ("1280678415822214057864524798453297819181910621573945477544758171055968245116423923");

    e = new BigInteger ("65537");

    c = new BigInteger ("62324783949134119159408816513334912534343517300880137691662780895409992760262021");

    phiN = new BigInteger ("1280678415822214057864524798453297819181910621573945477544758171055968245116423923");

    d = e.modInverse(phiN);
    m = c.modPow(d, N);

    System.out.println("d = "+d);           
    System.out.println("m = "+m);

    System.out.println("m in base 256 = "+base256(m));
    System.out.println("Convert with ASCII \n"+ Encode256(base256(m)));

}

static ArrayList<BigInteger> base256 (BigInteger M) {
BigInteger base = new BigInteger("256");
    ArrayList<BigInteger> message256 = new ArrayList<BigInteger>();
BigInteger sisa=M;
BigInteger k;
double z = Double.parseDouble(M.toString());
double p = Math.floor(Math.log(z)/Math.log(256));
int r = (int) p;
    for (int j=0;j<=r;j++){
        k=sisa.mod(base);
        sisa=sisa.divide(base);
        message256.add(k);
}
return message256;
}

static String Encode256 (ArrayList<BigInteger> ascii) {
String ascii256="";
int g,dmp;
for (int i=0;i<ascii.size();i++) {
g = Integer.parseInt(""+ascii.get(i));
ascii256=ascii256+( (char) g );
}
return ascii256;
}
