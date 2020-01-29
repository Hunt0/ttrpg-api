package com.tome.api.user

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User(@Id
           @GeneratedValue
           private val id: Long,
           private var username: String) {

}