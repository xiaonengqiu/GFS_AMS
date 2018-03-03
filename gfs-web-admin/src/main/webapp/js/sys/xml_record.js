$(function () {
    $("#jqGrid").jqGrid({
        url: '../sys/xml/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', width: 40, key: true },
			{ label: 'agency', name: 'agency', width: 100},
			{ label: 'headline', name: 'headline', width: 100,hidden:true},
			{ label: 'publish_date', name: 'publishDate', width: 100 },
            { label: 'city', name: 'city', width: 50 },
            { label: 'content', name: 'content', width: 100},
            { label: 'entered_by', name: 'enteredBy', width: 100},
            {
                label: 'headline',name: 'headline',
                formatter: function typeformatter(cellvalue, options, rowObject) {
                    var selectHtml="<a href='xml_detail.html?id=" + rowObject.id + "' class='ui-icon ui-icon-pencil' >"+rowObject.headline+"</a>";
                    return selectHtml
                }
            }
        ],
		viewrecords: true,
        height: 400,
        rowNum: 10,
		rowList : [10,100,1000],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		agency: null
	},
	methods: {
		query: function () {
			$("#jqGrid").jqGrid('setGridParam',{ 
                postData:{'agency': vm.agency,'city':vm.city,'headline':vm.headline,'content':vm.content,'publishDate':vm.date},
                page:1 
            }).trigger("reloadGrid");
		}
	}
});

