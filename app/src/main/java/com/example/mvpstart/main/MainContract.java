package com.example.mvpstart.main;

public interface MainContract {

    interface MvpPresenter {
        void showCorrectText(String input);
    }

    interface MvpView {
        void renderGreaterThan100();
        void renderResult(int result);
    }
}
