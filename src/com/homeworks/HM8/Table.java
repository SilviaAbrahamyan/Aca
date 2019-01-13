package com.homeworks.HM8;

/**
 * Created by home on 10/20/2018.
 */
public class Table {
    int id = - 1;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;

    public Table(int id) {
        this.id = id;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public void add(String[] words) {
        setA(words[0]);
        setB(words[1]);
        setC(words[2]);
        setD(words[3]);
        setF(words[4]);
        setE(words[5]);
        setG(words[6]);
        setH(words[7]);
        setI(words[8]);
        setJ(words[9]);
        setK(words[10]);
        setL(words[11]);
        setM(words[12]);
        setN(words[13]);
    }

    @Override
    public String toString() {
        return  id + " " +
                a + " " +
                b + " " +
                c + " " +
                d + " " +
                e + " " +
                f + " " +
                g + " " +
                h + " " +
                i + " " +
                j + " " +
                k + " " +
                l + " " +
                m + " " +
                n + " ";
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<Table>").append("\n");
        builder.append("\t").append("<a>").append(a).append("</a>").append("\n");
        builder.append("\t").append("<b>").append(b).append("</b>").append("\n");
        builder.append("\t").append("<c>").append(c).append("</c>").append("\n");
        builder.append("\t").append("<d>").append(d).append("</d>").append("\n");
        builder.append("\t").append("<e>").append(e).append("</e>").append("\n");
        builder.append("\t").append("<f>").append(f).append("</f>").append("\n");
        builder.append("\t").append("<g>").append(g).append("</g>").append("\n");
        builder.append("\t").append("<h>").append(h).append("</h>").append("\n");
        builder.append("\t").append("<i>").append(i).append("</i>").append("\n");
        builder.append("\t").append("<j>").append(j).append("</j>").append("\n");
        builder.append("\t").append("<k>").append(k).append("</k>").append("\n");
        builder.append("\t").append("<l>").append(l).append("</l>").append("\n");
        builder.append("\t").append("<m>").append(m).append("</m>").append("\n");
        builder.append("\t").append("<n>").append(n).append("</n>").append("\n");
        builder.append("</Table>");

        return builder.toString();
    }

    public String toJson() {
        StringBuilder builder = new StringBuilder();
        builder.append("{").append("\n");
        builder.append("\t").append("{").append("\n");
        builder.append("\t").append("\"a\" " + ":" + a + ",").append("\n");
        builder.append("\t").append("\"b\" " + ":" + b + ",").append("\n");
        builder.append("\t").append("\"c\" " + ":" + c + ",").append("\n");
        builder.append("\t").append("\"d\" " + ":" + d + ",").append("\n");
        builder.append("\t").append("\"e\" " + ":" + e + ",").append("\n");
        builder.append("\t").append("\"f\" " + ":" + f + ",").append("\n");
        builder.append("\t").append("\"g\" " + ":" + g + ",").append("\n");
        builder.append("\t").append("\"h\" " + ":" + h + ",").append("\n");
        builder.append("\t").append("\"i\" " + ":" + i + ",").append("\n");
        builder.append("\t").append("\"j\" " + ":" + j + ",").append("\n");
        builder.append("\t").append("\"k\" " + ":" + k + ",").append("\n");
        builder.append("\t").append("\"l\" " + ":" + l + ",").append("\n");
        builder.append("\t").append("\"m\" " + ":" + m + ",").append("\n");
        builder.append("\t").append("\"n\" " + ":" + n).append("\n");
        builder.append("\t").append("}").append("\n");
        builder.append("}");
        return builder.toString();
    }
}
