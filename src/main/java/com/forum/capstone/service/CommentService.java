package com.forum.capstone.service;

import com.forum.capstone.persistence.model.Comment;
import com.forum.capstone.web.dto.CommentDto;

public interface CommentService {

	void save(Comment comment);

	int countNumCommentsByPostId(Long postId);

	Comment createNewCommentOnPost(Long postId, CommentDto newCommentForm);

}
