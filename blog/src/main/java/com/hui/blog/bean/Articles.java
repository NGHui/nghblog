package com.hui.blog.bean;

public class Articles {
    private Long articleId;

    private Long userId;

    private String articleTitle;

    private Long articleViews;

    private Long articleCommentCount;

    private Long articleCreationTime;

    private Long articleUpdateTime;

    private String articleLikeCount;

    private String tag;

    private String articleContent;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Long getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(Long articleViews) {
        this.articleViews = articleViews;
    }

    public Long getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Long articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Long getArticleCreationTime() {
        return articleCreationTime;
    }

    public void setArticleCreationTime(Long articleCreationTime) {
        this.articleCreationTime = articleCreationTime;
    }

    public Long getArticleUpdateTime() {
        return articleUpdateTime;
    }

    public void setArticleUpdateTime(Long articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    public String getArticleLikeCount() {
        return articleLikeCount;
    }

    public void setArticleLikeCount(String articleLikeCount) {
        this.articleLikeCount = articleLikeCount == null ? null : articleLikeCount.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}