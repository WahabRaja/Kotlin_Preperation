package com.example.kotlinpreperation.retrofit

data class UsersResponse(
	val perPage: Int? = null,
	val total: Int? = null,
	val data: List<DataItem?>? = null,
	val page: Int? = null,
	val totalPages: Int? = null,
	val support: Support? = null
)

data class DataItem(
	val lastName: String? = null,
	val id: Int? = null,
	val avatar: String? = null,
	val firstName: String? = null,
	val email: String? = null
)

data class Support(
	val text: String? = null,
	val url: String? = null
)

