package ru.netology;

public class LikesInfo {
    private int count;
    private int canLikes; //соответствет user_likes
    //    private boolean canLike; -- данная переменная находится в методе RepostInfo наличие отметки "мне нравится" от текущего пользователя
    private int canPublish; //может ли текущий пользователь сделать репост

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanLikes() {
        return canLikes;
    }

    public void setCanLikes(int canLikes) {
        this.canLikes = canLikes;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}