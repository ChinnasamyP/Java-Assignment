select t.station_id,s.station_name,t.slot,t.time from times as t 
join station as s on t.station_id=s.id where t.slot=1 and 
cast(t.time as time) <'7:45' order by t.time;
