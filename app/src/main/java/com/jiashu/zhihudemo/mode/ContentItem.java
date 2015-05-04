package com.jiashu.zhihudemo.mode;

/** 封装 知乎内容 的bean
 * Created by Jiashu on 2015/5/4.
 */
public class ContentItem {

    private String author;  // 专栏作者 或 回答者 或 来源话题

    private String authorUrl;   // 专栏主页、个人主页、话题主页

    private String avatarImgUrl;    // 头像url

    private String title;   // 专栏文章标题 或 问题

    private String titleUrl;    // 专栏文章链接 或 问题链接

    private String content; // 文章内容摘要 或 答案摘要

    private String contentUrl;  // 查看全部 内容 的链接

    private String contentType;  // content的类型

    private int voteups;    // 点赞数

    private int comments;   // 评论数

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public String getAvatarImgUrl() {
        return avatarImgUrl;
    }

    public void setAvatarImgUrl(String avatarImgUrl) {
        this.avatarImgUrl = avatarImgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleUrl() {
        return titleUrl;
    }

    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public int getVoteups() {
        return voteups;
    }

    public void setVoteups(int voteups) {
        this.voteups = voteups;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }
}
