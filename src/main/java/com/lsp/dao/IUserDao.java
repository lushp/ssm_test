package com.lsp.dao;

import com.lsp.model.User;

public interface IUserDao {

    User selectUser(long id);

}