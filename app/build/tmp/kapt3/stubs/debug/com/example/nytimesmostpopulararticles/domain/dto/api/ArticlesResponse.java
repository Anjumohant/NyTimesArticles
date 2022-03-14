package com.example.nytimesmostpopulararticles.domain.dto.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/example/nytimesmostpopulararticles/domain/dto/api/ArticlesResponse;", "", "()V", "articles", "", "Lcom/example/nytimesmostpopulararticles/domain/dto/api/ArticlesResponse$Article;", "getArticles", "()Ljava/util/List;", "setArticles", "(Ljava/util/List;)V", "Article", "app_debug"})
public final class ArticlesResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article> articles;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article> getArticles() {
        return null;
    }
    
    public final void setArticles(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article> p0) {
    }
    
    public ArticlesResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b\u00a8\u0006&"}, d2 = {"Lcom/example/nytimesmostpopulararticles/domain/dto/api/ArticlesResponse$Article;", "", "()V", "abstractX", "", "getAbstractX", "()Ljava/lang/String;", "setAbstractX", "(Ljava/lang/String;)V", "byline", "getByline", "setByline", "id", "", "getId", "()J", "setId", "(J)V", "media", "", "Lcom/example/nytimesmostpopulararticles/domain/dto/api/ArticlesResponse$Article$MediaBean;", "getMedia", "()Ljava/util/List;", "setMedia", "(Ljava/util/List;)V", "publishedDate", "getPublishedDate", "setPublishedDate", "title", "getTitle", "setTitle", "type", "getType", "setType", "url", "getUrl", "setUrl", "MediaBean", "app_debug"})
    public static final class Article {
        private long id = 0L;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String url;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String byline;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String type;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String title;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "abstract")
        private java.lang.String abstractX;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "published_date")
        private java.lang.String publishedDate;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article.MediaBean> media;
        
        public final long getId() {
            return 0L;
        }
        
        public final void setId(long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final void setUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getByline() {
            return null;
        }
        
        public final void setByline(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getType() {
            return null;
        }
        
        public final void setType(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAbstractX() {
            return null;
        }
        
        public final void setAbstractX(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPublishedDate() {
            return null;
        }
        
        public final void setPublishedDate(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article.MediaBean> getMedia() {
            return null;
        }
        
        public final void setMedia(@org.jetbrains.annotations.Nullable()
        java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article.MediaBean> p0) {
        }
        
        public Article() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/example/nytimesmostpopulararticles/domain/dto/api/ArticlesResponse$Article$MediaBean;", "", "()V", "mediaMetaData", "", "Lcom/example/nytimesmostpopulararticles/domain/dto/api/ArticlesResponse$Article$MediaBean$MediaMetaDataBean;", "getMediaMetaData", "()Ljava/util/List;", "setMediaMetaData", "(Ljava/util/List;)V", "MediaMetaDataBean", "app_debug"})
        public static final class MediaBean {
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.SerializedName(value = "media-metadata")
            private java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article.MediaBean.MediaMetaDataBean> mediaMetaData;
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article.MediaBean.MediaMetaDataBean> getMediaMetaData() {
                return null;
            }
            
            public final void setMediaMetaData(@org.jetbrains.annotations.Nullable()
            java.util.List<com.example.nytimesmostpopulararticles.domain.dto.api.ArticlesResponse.Article.MediaBean.MediaMetaDataBean> p0) {
            }
            
            public MediaBean() {
                super();
            }
            
            @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/nytimesmostpopulararticles/domain/dto/api/ArticlesResponse$Article$MediaBean$MediaMetaDataBean;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "app_debug"})
            public static final class MediaMetaDataBean {
                @org.jetbrains.annotations.Nullable()
                private java.lang.String url;
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getUrl() {
                    return null;
                }
                
                public final void setUrl(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public MediaMetaDataBean() {
                    super();
                }
            }
        }
    }
}