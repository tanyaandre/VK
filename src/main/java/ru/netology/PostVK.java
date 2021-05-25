package ru.netology;

import java.util.Date;

public class PostVK {
    private int id;
    private int ownerId; //идентификатор владельца стены
    private Author author; //соответствует from_id
    private int createdById; //идентификатор админа для сообществ
    private Date date;
    private String text;
    private int replyOwnerId; //идентификатор владельца записи, исходная запись
    private int replyPostId; //идентификатор записи, испходная запись
    private int friendsOnly; //опция записи "только друзья"
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private int viewsInfo;
    private CommentsInfo commentsInfo;
    private Object postSource;
    private String postType; //тип записи: post, copy, reply, postpone, suggest
    private int signerId; // идентификатор автора, если запись от сообщества, а подписана пользователем
    private int canPin; //может ли текущий пользователь закрепить запись
    private int favorite;
    private int canEdit;
    private int canDelete;
    private int isPinned; //информация о том, что запись закреплена
    private int markedAsAds; //содержится ли реклама
    private int postponedId; //идентификатор отложенной записи

    public PostVK() {
    }

    public PostVK(int id, int ownerId, Author author, int createdById, Date date, String text, int replyOwnerId,
                  int replyPostId, int frendsOnly, LikesInfo likesInfo, RepostsInfo repostsInfo, int viewsInfo,
                  CommentsInfo commentsInfo, Object postSource, String postType, int signerId, int canPin,
                  int favorite, int canEdit, int canDelete, int isPinned, int markedAsAds, int postponedId) {
        this.id = id;
        this.ownerId = ownerId;
        this.author = author;
        this.createdById = createdById;
        this.date = date;
        this.text = text;
        this.replyOwnerId = replyOwnerId;
        this.replyPostId = replyPostId;
        this.friendsOnly = frendsOnly;
        this.likesInfo = likesInfo;
        this.repostsInfo = repostsInfo;
        this.viewsInfo = viewsInfo;
        this.commentsInfo = commentsInfo;
        this.postSource = postSource;
        this.postType = postType;
        this.signerId = signerId;
        this.canPin = canPin;
        this.favorite = favorite;
        this.canEdit = canEdit;
        this.canDelete = canDelete;
        this.isPinned = isPinned;
        this.markedAsAds = markedAsAds;
        this.postponedId = postponedId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getCreatedById() {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFrendsOnly() {
        return friendsOnly;
    }

    public void setFrendsOnly(int frendsOnly) {
        this.friendsOnly = frendsOnly;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public int getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(int viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Object getPostSource() {
        return postSource;
    }

    public void setPostSource(Object postSource) {
        this.postSource = postSource;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}