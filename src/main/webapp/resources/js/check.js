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
    })
})