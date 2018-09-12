$(function () {
/*
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
    });*/
    $("#selectinput").blur(function () {
        $.ajax({
            url:"/proselect",
            type:"post",
            dataType:"json",
            data:{"proName":$("#selectinput").val()},
            success:function (data) {
                $("#ProSize").val(data.proSize);
                $("#ProDate").val(data.proDate);
                $("#ProPrice").val(data.proPrice);
                $("#ProId").val(data.proId);
            },
            error:function(){
                return 1;
            }
        })
    });
    /**
     * 计算总和
     * */
    var talsum=0;//共计
    var sum=0;//总价
    var proName="";
    $("#num").on('input propertychange',function () {
        var num = parseFloat($(this).val());
        var price =parseFloat($("#ProPrice").val());
        sum=parseFloat(num) * parseFloat(price);
        $("#sumprice").val(sum);
        proName=$('#selectinput').val();

    });
    /**
     * 回车事件
     * 提交选择框内容至detail表格
     * */

    $("#num").keyup(function (event) {
        if(event.keyCode ==13){
            var newtr="<input hidden name='proId'value='"+$("#ProId").val()+"'>"+"<input name='proName' value="+proName+">"+"<input value="+$("#ProSize").val()+">"+"<input name='proDate' value="+$("#ProDate").val()+">"+"<input value="+ $("#ProPrice").val()+">"
                +"<input name='proNum' value="+$("#num").val()+">"+"<input value="+$("#sumprice").val()+"><br>";
            $('#selectinput').val('');
            $("#ProSize").val('');
            $("#ProDate").val('');
            $("#ProPrice").val('');
            $("#num").val('');
            $("#sumprice").val('');
            $("#detail").append(newtr);
            talsum=parseFloat(sum)+parseFloat(talsum);
            $("#total").val(talsum);
            $('#selectinput').focus();
        }
    });
    $("#ajaxsub").click(function () {
        $.ajax({
            url:"/Sell",
            type:"post",
            dataType:"json",
            data:$("#detail").serialize(),
            success:function(data) {
                alert(data.info);
                window.location.href="/Sell";
            },
            error:function(data){
                alert('e：'+data);
            }
        })
    })
})