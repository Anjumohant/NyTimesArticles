package com.example.nytimesmostpopulararticles.data.local.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.nytimesmostpopulararticles.domain.dto.db.Article;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ArticleDao_Impl implements ArticleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Article> __insertionAdapterOfArticle;

  private final EntityDeletionOrUpdateAdapter<Article> __deletionAdapterOfArticle;

  public ArticleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArticle = new EntityInsertionAdapter<Article>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorites` (`id`,`image_url`,`title`,`byline`,`abstract`,`published_date`,`url`,`cover_image_url`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Article value) {
        stmt.bindLong(1, value.getId());
        if (value.getImageUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageUrl());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getByline() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getByline());
        }
        if (value.getAbstractX() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAbstractX());
        }
        if (value.getPublishedDate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPublishedDate());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrl());
        }
        if (value.getCoverImageUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCoverImageUrl());
        }
      }
    };
    this.__deletionAdapterOfArticle = new EntityDeletionOrUpdateAdapter<Article>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favorites` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Article value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Article article, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfArticle.insert(article);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Article article, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfArticle.handle(article);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getFavoriteById(final long id, final Continuation<? super Article> p1) {
    final String _sql = "SELECT * FROM favorites WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.execute(__db, false, new Callable<Article>() {
      @Override
      public Article call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfByline = CursorUtil.getColumnIndexOrThrow(_cursor, "byline");
          final int _cursorIndexOfAbstractX = CursorUtil.getColumnIndexOrThrow(_cursor, "abstract");
          final int _cursorIndexOfPublishedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "published_date");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfCoverImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "cover_image_url");
          final Article _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpImageUrl;
            _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpByline;
            _tmpByline = _cursor.getString(_cursorIndexOfByline);
            final String _tmpAbstractX;
            _tmpAbstractX = _cursor.getString(_cursorIndexOfAbstractX);
            final String _tmpPublishedDate;
            _tmpPublishedDate = _cursor.getString(_cursorIndexOfPublishedDate);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            final String _tmpCoverImageUrl;
            _tmpCoverImageUrl = _cursor.getString(_cursorIndexOfCoverImageUrl);
            _result = new Article(_tmpId,_tmpImageUrl,_tmpTitle,_tmpByline,_tmpAbstractX,_tmpPublishedDate,_tmpUrl,_tmpCoverImageUrl);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Article>> getAllFavorites() {
    final String _sql = "SELECT * FROM favorites";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"favorites"}, false, new Callable<List<Article>>() {
      @Override
      public List<Article> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfByline = CursorUtil.getColumnIndexOrThrow(_cursor, "byline");
          final int _cursorIndexOfAbstractX = CursorUtil.getColumnIndexOrThrow(_cursor, "abstract");
          final int _cursorIndexOfPublishedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "published_date");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfCoverImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "cover_image_url");
          final List<Article> _result = new ArrayList<Article>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Article _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpImageUrl;
            _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpByline;
            _tmpByline = _cursor.getString(_cursorIndexOfByline);
            final String _tmpAbstractX;
            _tmpAbstractX = _cursor.getString(_cursorIndexOfAbstractX);
            final String _tmpPublishedDate;
            _tmpPublishedDate = _cursor.getString(_cursorIndexOfPublishedDate);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            final String _tmpCoverImageUrl;
            _tmpCoverImageUrl = _cursor.getString(_cursorIndexOfCoverImageUrl);
            _item = new Article(_tmpId,_tmpImageUrl,_tmpTitle,_tmpByline,_tmpAbstractX,_tmpPublishedDate,_tmpUrl,_tmpCoverImageUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
