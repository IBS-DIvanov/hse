package com.testproject.reqcrud.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Post", schema = "public", catalog = "postgres")
public class PostEntity {
    private int postId;
    private String postName;

    @Id
    @Column(name = "Post_ID")
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "Post_Name")
    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostEntity that = (PostEntity) o;

        if (postId != that.postId) return false;
        if (postName != null ? !postName.equals(that.postName) : that.postName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + (postName != null ? postName.hashCode() : 0);
        return result;
    }
}
