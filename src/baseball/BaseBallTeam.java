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

    }
    //球団の成績表示メソッド
    public String report() {

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
