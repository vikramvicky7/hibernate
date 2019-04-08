package com.CRUD;

import java.util.List;

public interface PostDAO {

	Post insert(Post post);

	Post update(Post post);

	Status delete(Post post);

	List<Post> view();

}
