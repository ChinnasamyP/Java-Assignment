
select station_id as route_id,min(stop_id) as source_stop_id,max(stop_id) as dest_stop_id from route_points group by station_id;

select station_id as route_id,(select station_name from station where id=min(stop_id)) as source_stop_name,(select station_name from station where id=max(stop_id)) as dest_stop_name from route_points group by station_id;