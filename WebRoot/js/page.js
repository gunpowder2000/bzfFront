function showPages(name) { //初始化属性
    this.name = name;      //对象名称
    this.page = 1;         //当前页数
    this.pageCount = 1;    //总页数
    this.argName = 'page'; //参数名
    this.showTimes = 1;    //打印次数
}

showPages.prototype.getPage = function(){ //丛url获得当前页数,如果变量重复只获取最后一个
    var args = location.search;
    var reg = new RegExp('[\?&]?' + this.argName + '=([^&]*)[&$]?', 'gi');
    var chk = args.match(reg);
    this.page = RegExp.$1;
}
showPages.prototype.checkPages = function(){ //进行当前页数和总页数的验证
    if (isNaN(parseInt(this.page))) this.page = 1;
    if (isNaN(parseInt(this.pageCount))) this.pageCount = 1;
    if (this.page < 1) this.page = 1;
    if (this.pageCount < 1) this.pageCount = 1;
    if (this.page > this.pageCount) this.page = this.pageCount;
    this.page = parseInt(this.page);
    this.pageCount = parseInt(this.pageCount);
}
showPages.prototype.createHtml = function(mode){ //生成html代码
    var strHtml = '', prevPage = this.page - 1, nextPage = this.page + 1;
    if (mode == '' || typeof(mode) == 'undefined') mode = 0;
    switch (mode) {
        case 0 : //模式2 (前后缩略,页数,首页,前页,后页,尾页)
            strHtml += '<div style = "text-align:center">';
            /*strHtml += '<span class="count">页数: ' + this.page + ' / ' + this.pageCount + '</span>';*/
            strHtml += '<span class="number">';
            if (prevPage < 1) {
                strHtml += '<span>首页</span>';
                strHtml += '<span>|&nbsp&nbsp上一页&nbsp&nbsp|</span>';
            } else {
                strHtml += '<span><a href="javascript:' + this.name + '.toPage(1)";>首页</a></span>';
                strHtml += '<span><a href="javascript:' + this.name + '.toPage(' + prevPage + ')";>|&nbsp&nbsp上一页&nbsp&nbsp|</a></span>';
            }
            if (this.page != 1) strHtml += '<span><a href="javascript:' + this.name + '.toPage(1);">第1页</a></span>';
            if (this.page >= 4) strHtml += '<span>...</span>';
            if (this.pageCount > this.page + 2) {
                var endPage = this.page + 2;
            } else {
                var endPage = this.pageCount;
            }
            for (var i = this.page - 2; i <= endPage; i++) {
                if (i > 0) {
                    if (i == this.page) {
                        strHtml += '<span>第' + i + '页</span>';
                    } else {
                        if (i != 1 && i != this.pageCount) {
                            strHtml += '<span><a href="javascript:' + this.name + '.toPage(' + i + ');">第' + i + '页</a></span>';
                        }
                    }
                }
            }
            if (this.page + 2 < this.pageCount) strHtml += '<span>...</span>';
            if (this.page != this.pageCount) strHtml += '<span><a href="javascript:' + this.name + '.toPage(' + this.pageCount + ');">第' + this.pageCount + '页</a></span>';
            if (nextPage > this.pageCount) {
                strHtml += '<span>| 下一页&nbsp&nbsp|</span>';
                strHtml += '<span>尾页</span>';
            } else {
                strHtml += '<span><a href="javascript:' + this.name + '.toPage(' + nextPage + ');">| 下一页&nbsp&nbsp|</a></span>';
                strHtml += '<span><a href="javascript:' + this.name + '.toPage(' + this.pageCount + ');">尾页</a></span>';
            }
            strHtml += '</span></div><br />';
            break;

    }
    return strHtml;
}
showPages.prototype.createUrl = function (page) { //生成页面跳转url
    if (isNaN(parseInt(page))) page = 1;
    if (page < 1) page = 1;
    if (page > this.pageCount) page = this.pageCount;
    var url = location.protocol + '//' + location.host + location.pathname;
    var args = location.search;
    var reg = new RegExp('([\?&]?)' + this.argName + '=[^&]*[&$]?', 'gi');
    args = args.replace(reg,'$1');
    if (args == '' || args == null) {
        args += '?' + this.argName + '=' + page;
    } else if (args.substr(args.length - 1,1) == '?' || args.substr(args.length - 1,1) == '&') {
        args += this.argName + '=' + page;
    } else {
        args += '&' + this.argName + '=' + page;
    }
    return url + args;
}
showPages.prototype.toPage = function(page){ //页面跳转
    var turnTo = 1;
    if (typeof(page) == 'object') {
        turnTo = page.options[page.selectedIndex].value;
    } else {
        turnTo = page;
    }
    self.location.href = this.createUrl(turnTo);
}
showPages.prototype.printHtml = function(mode){ //显示html代码
    this.getPage();
    this.checkPages();
    this.showTimes += 1;
    document.write('<div id="pages_' + this.name + '_' + this.showTimes + '" class="pages"></div>');
    document.getElementById('pages_' + this.name + '_' + this.showTimes).innerHTML = this.createHtml(mode);
	
}
showPages.prototype.formatInputPage = function(e){ //限定输入页数格式
    var ie = navigator.appName=="Microsoft Internet Explorer"?true:false;
    if(!ie) var key = e.which;
    else var key = event.keyCode;
    if (key == 8 || key == 46 || (key >= 48 && key <= 57)) return true;
    return false;
}
