<%--
  Created by IntelliJ IDEA.
  User: ZX
  Date: 2018/5/11
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="../../js/vue.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>


<div id="app">
    {{ message }}
</div>

<div id="app-2">
  <span v-bind:title="message">
    鼠标悬停几秒钟查看此处动态绑定的提示信息！
  </span>
</div>

<div id="app-3">
    <p v-if="a">现在你看到我了</p>
</div>

<div id="app-4">
    <ol>
        <li v-for="todo in todos">
            {{ todo.text }}
        </li>
    </ol>
</div>

<div id="app-5">
    <p>{{ message }}</p>
    <button v-on:click="reverseMessage">逆转消息</button>
</div>


<div id="components-demo">
    <button-counter></button-counter>
</div>


<div id="blog-posts-events-demo">
    <div :style="{ fontSize: postFontSize + 'em' }">
        <blog-post
                v-on:enlarge-text="postFontSize += 0.1"
                v-for="post in posts"
                v-bind:key="post.id"
                v-bind:post="post"
        ></blog-post>
    </div>
</div>



</body>
</html>

<script>
    var app = new Vue({el: '#app', data: {message: 'Hello Vue!'}})

    var app2 = new Vue({
        el: '#app-2',
        data: {
            message: '页面加载于 ' + new Date().toLocaleString()
        }
    })

    var app3 = new Vue({
        el: '#app-3',
        data: {
            a: true
        }
    })

    var app4 = new Vue({
        el: '#app-4',
        data: {
            todos: [
                { text: '学习 JavaScript' },
                { text: '学习 Vue' },
                { text: '整个牛项目' }
            ]
        }
    })

    var app5 = new Vue({
        el: '#app-5',
        data: {
            message: 'Hello Vue.js!'
        },
        methods: {
            reverseMessage: function () {
                this.message = this.message.split('').reverse().join('')
            }
        }
    })


    Vue.component('button-counter', {
        data: function () {
            return {
                count: 0
            }
        },
        template: '<button v-on:click="count++">You clicked me {{ count }} times.</button>'
    })

    new Vue({ el: '#components-demo' })


    Vue.component('blog-post', {
        props: ['post'],
        template: '<div class="blog-post"> <h3>{{ post.title }}</h3> <button v-on:click="$emit(\'enlarge-text\')" > Enlarge text </button> <div v-html="post.content"></div> </div>'
    })

    new Vue({
        el: '#blog-posts-events-demo',
        data: {
            posts: [
                { id: 1, title: 'My journey with Vue' },
                { id: 2, title: 'Blogging with Vue' },
                { id: 3, title: 'Why Vue is so fun' },
            ],
            postFontSize: 1
        }

    })


</script>
