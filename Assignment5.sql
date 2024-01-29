
select r.id as route_id,r.name,sum(rp.distance) as total_distance from routes as r 
join route_points as rp on r.id=rp.route_id group by rp.route_id  order by total_distance desc;
