package com.example.mvpstart;

import com.example.mvpstart.main.MvpView;
import com.example.mvpstart.main.MainPresenter;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {
    private MvpView view;

    private MainPresenter testSubject;

    @Before
    public void setup() {
        view = mock(MvpView.class);
        testSubject = new MainPresenter(view);
    }

    @Test
    public void GivenInputOf200_WhenShowCorrectTestIsCalled_ThenCallRenderGreaterThan100() {
        // Given
        String input = "200";

        // When
        testSubject.showCorrectText(input);

        // Then
        verify(view).renderGreaterThan100();
        verify(view, never()).renderResult(200);
    }

    @Test
    public void GivenInputOf2_WhenShowCorrectTestIsCalled_ThenCallRenderResult() {
        // Given
        String input = "2";

        // When
        testSubject.showCorrectText(input);

        // Then
        verify(view).renderResult(20);
        verify(view, never()).renderGreaterThan100();
    }

    @Test
    public void GivenInputOf100_WhenShowCorrectTestIsCalled_ThenCallRenderResult() {
        // Given
        String input = "100";

        // When
        testSubject.showCorrectText(input);

        // Then
        verify(view).renderGreaterThan100();
        verify(view, never()).renderResult(1000);
    }
}
