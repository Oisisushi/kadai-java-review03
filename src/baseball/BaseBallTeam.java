package baseball;

public class BaseBallTeam {
    private String name;// 球団名
    private int win;//     勝ち数
    private int lose;//    負け数
    private int draw;//    引き分け数

    //念のため作る引数なしコンストラクタ
    public BaseBallTeam() {
    }
    //引数4つ、BaseBallTeam生成用コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //doubleで返す勝率計算メソッド
    public double getRate() {
        double rate = ((double)this.win/(this.win + this.lose));
        return rate;

    }
    //球団の成績表示メソッド
    public void report(double rate) {
        System.out.println(this.name + " の2022年の成績は " + this.win + "勝 " + this.lose + "敗 " + this.draw + "分、勝率は " + rate +
                "です。");
    }

    //getterとsetter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }

}
