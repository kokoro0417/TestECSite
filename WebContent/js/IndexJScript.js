jQuery(function(){
    
    $(document).ready(function(){
        $(".a_item").click(function(){
            $(this).next().slideToggle(300);
        });
    });
    
    $("h1").click(function(){
                  $(".test1").css("color","red");
                  });
    
    $("h1").css("color","red");
    $("p").fadeOut("slow");
    $("h2").text("おやすみ");
    
    $(".test1").click(function(){
        $(".test2").text("teeeeest2!!");
    });
    
    $(".boxA").click(function(){
        $(".boxB").hide();
    });
    
   // $(".boxs").hover(
    $(".boxs").hover(
        function(){
            $(".boxA,.boxB,.boxC").animate({width:"200px"});

        },
        function(){
            $(".boxA,.boxB,.boxC").animate({width:"100px"});

        }
    );
    $(".hako").mouseover(function(){
        $(this).css("background-color","white");
    });
    
});