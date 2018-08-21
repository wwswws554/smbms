function cx(id){
			$.get("allFlight_tickets.json","id="+id,function(data){
				$("#hk_"+id).html("");
				var options = "";
				for(var i = 0; i < data.length; i++){
					options += "<tr><td>"+data[i].sellCompany+"</td><td>￥"+data[i].ticketPrice+"</td></tr>";
				}
				$("#hk_"+id).html(options);
			},"json");
		}