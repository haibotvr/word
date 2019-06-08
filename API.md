# 接口文档
## 一、后台相关

### 说明：所有非登录接口,请求headers中需要添加token

### 1、邮件
#### 1)、发送邮件
请求模拟：curl -i -X POST -H 'Content-type':'application/json' -d '{"recipientIds":"1","mailTitle":"邮件","mailContent":"内容"}' http://localhost:9001/word/extra/sendEmail -v

请求方式：POST

请求参数：
recipientIds 收件人ID（逗号拼接)
mailTitle 标题
mailContent 内容

返回结果：
```json
{
    "code": 200,
    "message": "发送成功",
    "data": null,
    "error": false,
    "success": true
}
```
#### 2)、保存草稿
请求模拟：curl -i -X POST -H 'Content-type':'application/json' -d '{"recipientIds":"1","mailTitle":"邮件","mailContent":"内容"}' http://localhost:9001/word/extra/saveDraft -v

请求方式：POST

请求参数：
recipientIds 收件人ID（逗号拼接)
mailTitle 标题
mailContent 内容

返回结果：
```json
{
    "code": 200,
    "message": "保存成功",
    "data": null,
    "error": false,
    "success": true
}
```
#### 3)、删除邮件
请求模拟：curl -i -X POST -H 'Content-type':'application/json' -d '{"ids":"1"}' http://localhost:9001/word/extra/delEmail -v

请求方式：POST

请求参数：
ids 邮件ids字符串（逗号拼接)

返回结果：
```json
{
    "code": 200,
    "message": "删除成功",
    "data": null,
    "error": false,
    "success": true
}
```
#### 4)、查询邮件
请求模拟：curl -i -X POST -H 'Content-type':'application/json' -d '{"id":"1"}' http://localhost:9001/word/extra/findEmail -v

请求方式：POST

请求参数：
id 邮件ID

返回参数：
mailTitle 标题
createTime 时间
senderName 发件人
mailContent 邮件内容

返回结果：
```json
{
    "code": 200,
    "message": "成功",
    "data": {
        "id": 1,
        "recipientId": 1,
        "senderId": 2,
        "oaStatus": 0,
        "mailTitle": "邮件",
        "createTime": "2019-06-06 17:09:20",
        "updateTime": null,
        "isCheck": 0,
        "senderName": "管理员",
        "isDraft": 0,
        "recipientIds": null,
        "mailContent": "内容"
    },
    "error": false,
    "success": true
}
```
#### 5)、分页查询邮件
请求模拟：curl -i -X POST -H 'Content-type':'application/json' -d '{"emailType":"2","pageNum":"1","pageSize":"1"}' http://localhost:9001/word/extra/findEmailByPage -v

请求方式：POST

请求参数：
emailType 分类 1：收件箱 2：已发送 3：草稿箱 4：已删除
pageNum 第几页
pageSize 每页数据条数

返回参数：
mailTitle 标题
createTime 时间
senderName 发件人
mailContent 邮件内容

返回结果：
```json
{
    "code": 200,
    "message": "成功",
    "data": {
        "total": 1,
        "list": [
            {
                "id": 2,
                "recipientId": 2,
                "senderId": 2,
                "oaStatus": 1,
                "mailTitle": "邮件",
                "createTime": "2019-06-06 17:09:22",
                "updateTime": null,
                "isCheck": 0,
                "senderName": "管理员",
                "isDraft": 0,
                "recipientIds": null,
                "mailContent": null
            }
        ],
        "pageNum": 1,
        "pageSize": 1,
        "size": 1,
        "startRow": 1,
        "endRow": 1,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    },
    "error": false,
    "success": true
}
```
#### 6)、查询用户
请求模拟：curl -H 'token':'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjp7ImlkIjoxLCJsb2dpbk5hbWUiOiJsaXdlbnhpbiIsImxvZ2luUGFzc3dvcmQiOiIxMjM0NTYiLCJhdmF0YXIiOiJodHRwOi8vMjExLjE0OS4xNDMuNTg6OTAwMS93b3JkLzAyLmpwZyIsIm9hU3RhdHVzIjoxLCJjcmVhdGVUaW1lIjoxNTU5NjQ0NDExMDAwLCJ1cGRhdGVUaW1lIjoxNTU5NjQ0NDE2MDAwLCJyZWFsTmFtZSI6IuadjuaWh-asoyJ9LCJleHAiOjE1NTk5NjQxNDEsIm5iZiI6MTU1OTk1Njk0MX0.QXQaFjbtIZBI0fStRVDFCrAP0uiUHGpH2nnjvu7WZu0' http://localhost:9001/word/extra/findUsers -v

请求方式：GET

返回参数：
id 用户id
realName 用户姓名

返回结果：
```json
{
    "code":200,
    "message":"成功",
    "data":[
        {
            "id":1,
            "realName":"李文欣"
        },
        {
            "id":2,
            "realName":"管理员"
        },
        {
            "id":3,
            "realName":"测试用户"
        }
    ],
    "error":false,
    "success":true
}
```
#### 7)、永久删除邮件
请求模拟：curl -i -X POST -H 'Content-type':'application/json' -d '{"ids":"1"}' http://localhost:9001/word/extra/radicalDelEmail -v

请求方式：POST

请求参数：
ids 邮件ids字符串（逗号拼接)

返回结果：
```json
{
    "code": 200,
    "message": "删除成功",
    "data": null,
    "error": false,
    "success": true
}
```
#### 7)、发送草稿
请求模拟：curl -i -X POST -H 'Content-type':'application/json' -d '{"ids":"1"}' http://localhost:9001/word/extra/sendDraft -v

请求方式：POST

请求参数：
id 邮件id

返回结果：
```json
{
    "code": 200,
    "message": "发送成功",
    "data": null,
    "error": false,
    "success": true
}
```