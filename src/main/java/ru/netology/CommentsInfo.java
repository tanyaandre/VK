package ru.netology;

public class CommentsInfo {
    private int count;
    private int canComment; //соответствует can_post
    private int groupsCanPost; //может ли сообщество оставлять коммент
    private int canClose; //может ли текущий пользователь закрыть комментарий к записи
    private int canOpen; //может ли текущий пользователь открывать комментарий к записи

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanComment() {
        return canComment;
    }

    public void setCanComment(int canComment) {
        this.canComment = canComment;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public int getCanClose() {
        return canClose;
    }

    public void setCanClose(int canClose) {
        this.canClose = canClose;
    }

    public int getCanOpen() {
        return canOpen;
    }

    public void setCanOpen(int canOpen) {
        this.canOpen = canOpen;
    }
}