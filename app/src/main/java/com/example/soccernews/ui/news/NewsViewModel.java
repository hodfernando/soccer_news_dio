package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> mNews;

    public NewsViewModel() {
        this.mNews = new MutableLiveData<>();

        //TODO: Remover Mock de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviaria Tem Desfalque Importante", ""));
        news.add(new News("Ferrinha Joga No Sabado", ""));
        news.add(new News("Copa Do Mundo Feminina Está Terminando", ""));

        this.mNews.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.mNews;
    }
}