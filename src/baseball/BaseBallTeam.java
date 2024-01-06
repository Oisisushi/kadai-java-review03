package baseball;

public class BaseBallTeam {
    private String name;// 球団名
    private int win;//     勝ち数
    private int lose;//    負け数
    private int draw;//    引き分け数

    //念のため作る引数なしコンストラクタ
    public baseball() {
    }
    //引数4つ、球団生成用コンストラクタ
    public baseball(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {

    }

    public String report() {

    }

}
