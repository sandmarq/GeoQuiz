package ca.sandmarq.geoquiz.geoquiz;

/**
 * Created by SANDRINE.MARQUIS on 2014-11-24.
 */
public class TrueFalse {
    private boolean mTrueQuestion;
    private int mQuestion;

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }


}