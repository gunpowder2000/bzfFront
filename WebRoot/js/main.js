// JavaScript Document
$(function(){
  $(".menu ul li").hover(function(){
	  $(this).children("a").addClass("on");
	  $(this).find('.showbox dl dt').eq(0).addClass('onCmenu');
	 $(".showbox",this).show();
	 $(".showbox",this).find($('dl dd a')).hover(function(){
		 var  aIndex=$(this).parent().parent().find('dd a').index(this); 
		 var cMenuLength=$(this).parent().parent().find('dt').length;
		 if(aIndex>=cMenuLength) return ;
		 $(this).parent().parent().find('dt').removeClass('onCmenu');
		 $(this).parent().parent().find('dt').eq(aIndex).addClass('onCmenu');
		 });
  },function(){
	 $(this).children("a").removeClass("on");
	 $(".showbox",this).hide().find('.onCmenu').removeClass('onCmenu');
	  })
	
  $(".sidemenu li:last").css("border","none");	
  //
  $('.key').focus(function(){
	    if($(this).val() == this.defaultValue)
		{
			$(this).val("");
		}
   }).blur(function(){
	   if($(this).val()=="")
	   {
		   $(this).val(this.defaultValue);
	   }
   });	
	  $(".con_textarea").focus(function(){
       if($(this).val() == this.defaultValue)
	   {
		   $(this).val("");
	   }	
    }).blur(function(){
        if($(this).val() == ""){
          $(this).val(this.defaultValue);
        }
    });  
	$('.con_textarea').bind("keyup mouseup",function(){
	   	var oTextLength=$('.con_textarea').val().length;
		if(oTextLength>500)
		  {
			 var curTxt=$(".con_textarea").val().substring(0,500);
			 $(".con_textarea").val(curTxt);
			 alert("你好，你输入的文字不能超过500个!");
		  }
	}) 
	//
	$(".workslist ul li").hover(function(){
	    $(this).addClass("bk");  
		$(this).children().find("a").addClass("hover");
	},function(){
		$(this).removeClass("bk"); 
		$(this).children().find("a").removeClass("hover");
	});
	
	
	$(".years").hover(function(){
	    $(".year_list").show();	
	},function(){
		$(".year_list").hide();	
		})
		
  //
  $('#map a').bind("click",function(){
			var aid= $(this).attr("id");
			if($(this).hasClass("m"))
			{
		       if(aid)
			    {
					 $('#c'+aid).show().siblings().hide();
				 }
		    }
             else
			{
					$('#c'+aid).show().siblings().hide();
			}
      })
   $(".close").click(function(){
	  $(".con").css("display","none");
  });	
  $(".con table tr:even").css("background","#f7f7f7");
  
  $(".book ul li").hover(function(){
	  $(this).children().find("img").css("border","1px solid #25c1d4"); 
	  $(this).children().find("a").css("color","#25c1d4");  
  },function(){
	   $(this).children().find("img").css("border","1px solid #ccc"); ;
	   $(this).children().find("a").css("color","#493639");  
	  })
	//
	$(".tabcon").not(":first").hide();
	$(".nettab li").click(function(){
		 $(this).addClass("on").siblings().removeClass("on");
	     var index=$(".nettab li").index( $(this));
         $(".tabcon").eq(index).siblings(".tabcon").hide().end().show(); 
	})
	
	$(".listbox").each(function(){
	   	$(".listbox").hover(function(){
		    $(".listabj",this).show();	
			$(this).children().find("h3").addClass("hover");
		},function(){
			$(".listabj",this).hide();	
			$(this).children().find("h3").removeClass("hover");
			})
	})
	
	$(".case ul li").hover(function(){
		$(this).css("background","#f2f2f2");
		$(this).children("p").find("a").addClass("hover");
		$(this).children().find("img").css("border","1px solid #21b8ce");
	},function(){
		$(this).css("background","none");
		$(this).children().find("img").css("border","1px solid #674f52");
		})
/*2013-08-30*/
$('.sidemenu li').hover(function(){
	$(this).css('background','#919191');},
function(){
	$(this).css('background','transparent');});


$('.tabslide h3').hover(function(){
	$(this).css('background','#919191');},
function(){
	$(this).css('background','#f7f7f7');});


});


