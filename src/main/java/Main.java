import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        String s = ASS.infixToRpn("y^4+2+c^3");
        String[] result = s.split("");
        System.out.println(Arrays.toString(result));
        solution sol = new solution();
        String r1 = String.valueOf(sol.stacky(result, 2));
        System.out.println(r1);
        }
    }

