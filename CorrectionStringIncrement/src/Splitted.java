public class Splitted {
    public String txt = "";
    public int nb = 0;

    public Splitted(String txt, int nb) {
        this.txt = txt;
        this.nb = nb;
    }

    @Override
    public String toString() {
        return "Splitted{" +
                "txt='" + txt + '\'' +
                ", nb=" + nb +
                '}';
    }
}
