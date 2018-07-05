$(function () {

    $("#stuno").blur(function () {
        $.ajax({
            url:"/check",
            type:"post",
            dataType:"json",
            data:{"stuno":$("#stuno").val()},
            success:function (data) {
                $("#show_stuno_result").html(data.info);
            }
        })
    });
    $("#select").blur(function () {
        $.ajax({
            url:"/proselect",
            type:"post",
            dataType:"json",
            data:{"proName":$("#select").val()},
            success:function (data) {
                $("#ProSize").val(data.ProSize);
                $("#ProDate").val(data.ProDate);
                $("#ProPrice").val(data.ProPrice);
            },
            error:function(){
                alert("错误");
            }
        })
    });
    /**
     * 计算总和
     * */
    $(".num").on('input propertychange',function () {
        var num = this.val();
        var price = $(this).previousSibling.val();
        $(this).nextSibling.val(num * price);
    });
    var newtr=$("#selectedtr").html;
    /**
     * 回车事件
     * 提交选择框内容至detail表格
     * */

    $(".num").keyup(function (event) {
        if(event.keyCode ==13){
            alert("回车");
            $("#detail").appendChild(newtr);
        }
    })
})