# 微服務互相呼叫 Demo（Spring Boot + OpenFeign）

兩個 Spring Boot 服務在本機互相呼叫：
- **tommy_user**：提供使用者查詢（假資料、不連 DB）
- **tommy_order**：透過 **OpenFeign** 呼叫 `tommy_user`，組裝訂單回傳


user-service：http://localhost:8081/users/1
order-service：http://localhost:8082/orders/1
