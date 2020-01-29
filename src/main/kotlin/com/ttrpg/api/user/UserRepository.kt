package com.tome.api.user

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
}